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

}
