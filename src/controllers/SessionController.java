package controllers;

import models.Session;
import repositories.SessionRepository;

public class SessionController {
    private static SessionRepository sessionRepository = new SessionRepository();

    public void addSession (Session s) throws Exception{
        sessionRepository.addObject(s);
    }
    public void removeSession (Session s) throws Exception{
        sessionRepository.removeObject(s);
    }
    public void editSession (Session s1, Session s2) throws Exception{
        sessionRepository.editObject(s1, s2);
    }




    public void startSession(Session session) throws Exception {
        sessionRepository.setActiveSession(session);
        sessionRepository.addObject(session);
    }

    public void endSession() throws Exception {
        Session oldSession = (Session) SessionRepository.getActiveSession().clone();
        Session tempActiveSession = SessionRepository.getActiveSession();
        tempActiveSession.setFinalTimeStamp();
        sessionRepository.setActiveSession(tempActiveSession);
        sessionRepository.editObject(oldSession, SessionRepository.getActiveSession());
        sessionRepository.setActiveSession(null);
    }
}