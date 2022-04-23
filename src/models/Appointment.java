package models;

import java.time.LocalDateTime;

public class Appointment extends Event {
    private User vet;
    private String clinic;
    private String description;

    public Appointment(User vet, String clinic, String description, Pet pet, String title, LocalDateTime date, String id) {
        super(pet, title, clinic, date, id);
        this.vet = vet;
        this.clinic = clinic;
        this.description = description;
    }

    public User getVet() {
        return this.vet;
    }

    public void setVet(User vet) {
        this.vet = vet;
    }

    public String getClinic() {
        return this.clinic;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
