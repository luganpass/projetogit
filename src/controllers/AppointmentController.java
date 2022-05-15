package controllers;

import models.Appointment;
import repositories.AppointmentRepository;

public class AppointmentController {
    private static AppointmentRepository appointmentRepository = new AppointmentRepository();

    public void addAppointment (Appointment ap) throws Exception{
        appointmentRepository.addObject(ap);
    }
    public void removeAppointment (Appointment ap) throws Exception {
        appointmentRepository.removeObject(ap);
    }
    public void editAppointment (Appointment ap1, Appointment ap2) throws Exception {
        appointmentRepository.editObject(ap1, ap2);
    }
}