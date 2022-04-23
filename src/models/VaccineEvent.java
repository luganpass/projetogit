package models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VaccineEvent extends Event {
    private double dose;
    private int doseNumber;
    private Appointment appointment;
    private Vaccine vaccine;

    public VaccineEvent(double dose, int doseNumber, Appointment appointment, Vaccine vaccine, Pet pet, LocalDateTime date, String id) {
        super(pet, vaccine.getName(), date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")), date, id);
        this.dose = dose;
        this.doseNumber = doseNumber;
        this.appointment = appointment;
        this.vaccine = vaccine;
    }

    public double getDose() {
        return this.dose;
    }

    public void setDose(double dose) {
        this.dose = dose;
    }

    public int getDoseNumber() {
        return this.doseNumber;
    }

    public void setDoseNumber(int doseNumber) {
        this.doseNumber = doseNumber;
    }

    public Appointment getAppointment() {
        return this.appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public Vaccine getVaccine() {
        return this.vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

}
