package models;

import java.time.LocalDateTime;

public abstract class Listable extends Identifiable {
    private String title;
    private String subtitle;
    private LocalDateTime date;

    public Listable(String title, String subtitle, LocalDateTime date, String id) {
        super(id);
        this.title = title;
        this.subtitle = subtitle;
        this.date = date;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public LocalDateTime getDate() {
        return this.date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object obj){
        if(!super.equals(obj)){
            return false;
        }       
        if (obj instanceof Listable){
            Listable listableObj = (Listable)obj;
            if(!listableObj.getTitle().equals(this.getTitle())){
                return false;
            }
            else if (!listableObj.getSubtitle().equals(this.getSubtitle())){
                return false;
            }
            else if (!listableObj.getDate().equals(this.getDate())){
                return false;
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }
    }

}
