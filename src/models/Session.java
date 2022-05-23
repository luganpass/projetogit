package models;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Session extends Identifiable implements Cloneable {
    public final User CURRENT_USER;
    private final LocalDateTime INITIAL_TIME_STAMP;
    private final LocalDateTime FINAL_TIME_STAMP;

    public Session(User user, LocalDateTime initialTimeStamp, String id) {
        super(id);
        this.CURRENT_USER = user;
        this.FINAL_TIME_STAMP = initialTimeStamp;
        this.INITIAL_TIME_STAMP = initialTimeStamp;
    }

    public User getCURRENT_USER() {
        return this.CURRENT_USER;
    }

    public LocalDateTime getInitialTimeStamp() {
        return this.INITIAL_TIME_STAMP;
    }

    public LocalDateTime getFinalTimeStamp() {
        return this.FINAL_TIME_STAMP;
    }

    public void setFinalTimeStamp() {
        this.FINAL_TIME_STAMP.plus(this.INITIAL_TIME_STAMP.until(LocalDateTime.now(), ChronoUnit.MILLIS), ChronoUnit.MILLIS);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();    // return shallow copy
    }
    @Override
    public boolean equals (Object obj){
        if (!super.equals(obj)){
            return false;
        }
        if (obj instanceof Session){
            Session sessionObj = (Session)obj;
            if (!sessionObj.getCURRENT_USER().equals(this.getCURRENT_USER())){
                return false;
            }
            else if (!sessionObj.getInitialTimeStamp().equals(this.getInitialTimeStamp())){
                return false;
            }
            else if (!sessionObj.getFinalTimeStamp().equals(this.getFinalTimeStamp())){
                return false;
            }
            else if (!sessionObj.getId().equals(this.getId())){
                return false;
            }
            else{
                return true;
            }
        }
        else {
            return false;
        }
    }


}
