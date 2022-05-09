package repositories;

import models.Session;

public class SessionRepository extends Repository {
    public static Session activeSession;

    public SessionRepository() {
        super("SessionRepository");
    }

    public void startSession(Session session) throws Exception {
        activeSession = session;
        this.addObject(session);
    }

    public void endSession() throws Exception {
        Session oldSession = (Session) activeSession.clone();
        activeSession.setFinalTimeStamp();
        this.editObject(oldSession, activeSession);
        activeSession = null;
    }
    
}
