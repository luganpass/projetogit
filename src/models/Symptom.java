package models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Symptom extends Event {
    private String title;
    private String description;

    public Symptom(String title, String description, Pet pet, LocalDateTime date, String id) {
        super(pet, title, date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")), date, id);
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public boolean equals (Object obj){
        if (!super.equals(obj)){
            return false;
        }
        if (obj instanceof Symptom){
            Symptom symptomObj = (Symptom)obj;
            if (!symptomObj.getTitle().equals(this.getTitle())){
                return false;
            }
            else if (!symptomObj.getDescription().equals(this.getDescription())){
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
