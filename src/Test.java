import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import helpers.Enums.Species;
import helpers.Enums.UserType;
import models.Appointment;
import models.Diagnosis;
import models.Pet;
import models.Session;
import models.Symptom;
import models.User;
import models.Vaccine;
import models.VaccineEvent;

public class Test {

    public static void main (String []args){
        Appointment appointment2 = new Appointment(new User("name", "email", 20, "password", UserType.Vet, "3278697"), "clinic", "description", new Pet("name", Species.Cat, 2.0, 2374984, 2.0, 2.0, 2.0, LocalDate.now(), new User("name", "email", 20, "password", UserType.Vet, "3278697"), "37987"), "title", LocalDateTime.now(), "437896");
        Appointment appointment = new Appointment(new User("name", "email", 20, "password", UserType.Vet, "3278697"), "clinic", "description", new Pet("name", Species.Cat, 2.0, 2374984, 2.0, 2.0, 2.0, LocalDate.now(), new User("name", "email", 20, "password", UserType.Vet, "3278697"), "37987"), "title", LocalDateTime.now(), "437896");
        Pet pet = new Pet("name", Species.Cat, 2.0, 2374984, 2.0, 2.0, 2.0, LocalDate.now(), new User("name", "email", 20, "password", UserType.Vet, "3278697"), "37987");
        User user = new User("name", "email", 20, "password", UserType.Vet, "3278697");
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime fromDateAndTime = LocalDateTime.of(currentDate, currentTime);
        Diagnosis diagn = new Diagnosis("title", user, "clinic" , "description", appointment, pet, fromDateAndTime, "34");
        Diagnosis diagn2 = new Diagnosis("title", user, "clinic" , "description", appointment, pet, fromDateAndTime, "34");
        Session sesh = new Session(user, fromDateAndTime, "12");
        Session sesh2 = new Session(user, fromDateAndTime, "122");
        LocalDateTime fromDateAndTime2 = LocalDateTime.of(currentDate, currentTime).plusDays(1);
        
        Symptom sint = new Symptom("title", "description", pet, fromDateAndTime, "12");
        Symptom sint2 = new Symptom("title", "description", pet, fromDateAndTime, "12");
        Vaccine vac = new Vaccine("name", "imagepath", "12");
        Vaccine vac2 = new Vaccine("name", "imagepath", "12");
        VaccineEvent vacc = new VaccineEvent(12, 3, appointment, vac, pet, fromDateAndTime, "12");
        VaccineEvent vacc2 = new VaccineEvent(12, 3, appointment, vac, pet, fromDateAndTime2, "12");
        
        System.out.println(sint.equals(sint2));
    }
}