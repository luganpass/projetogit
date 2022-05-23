package models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Diagnosis extends Event {
    private User vet;
    private String clinic;
    private String description;
    private Appointment appointment;

    public Diagnosis(String title, User vet, String clinic, String description, Appointment appointment, Pet pet, LocalDateTime date, String id) {
        super(pet, title, date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")), date, id);
        this.vet = vet;
        this.clinic = clinic;
        this.description = description;
        this.appointment = appointment;
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

    public Appointment getAppointment() {
        return this.appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }
    
    @Override
    public boolean equals (Object obj){
        if (!super.equals(obj)){
            return false;
        }
        if (obj instanceof Diagnosis){
            Diagnosis diagnosisObj = (Diagnosis)obj;
            if (!diagnosisObj.getClinic().equals(this.getClinic())){
                return false;
            }
            else if (!diagnosisObj.getVet().equals(this.getVet())){
                return false;
            }
            else if (!diagnosisObj.getDescription().equals(this.getDescription())){
                return false;
            }
            else if(!diagnosisObj.getAppointment().equals(this.getAppointment())){
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

