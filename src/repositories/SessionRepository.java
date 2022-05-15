package repositories;

import models.Session;

public class SessionRepository extends Repository {
    private static Session activeSession;
    
    public static Session getActiveSession(){
        return SessionRepository.activeSession;
    }

    public void setActiveSession(Session session){
        SessionRepository.activeSession = session;
    }
    
    public SessionRepository() {
        super("SessionRepository");
    }

    
}
