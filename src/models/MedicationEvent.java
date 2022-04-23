package models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MedicationEvent extends Event {
    private double dose;
    private int doseNumber;
    private Appointment appointment;
    private Medication medication;

    public MedicationEvent(double dose, int doseNumber, Appointment appointment, Medication medication, Pet pet, LocalDateTime date, String id) {
        super(pet, medication.getName(), date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")), date, id);
        this.dose = dose;
        this.doseNumber = doseNumber;
        this.appointment = appointment;
        this.medication = medication;
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

    public Medication getMedication() {
        return this.medication;
    }

    public void setMedication(Medication medication) {
        this.medication = medication;
    }
}
