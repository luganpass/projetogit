import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import helpers.Enums.Species;
import helpers.Enums.UserType;
import models.Appointment;
import models.Identifiable;
import models.Pet;
import models.User;
import repositories.AppointmentRepository;
import repositories.PetRepository;

public class Test {
    public static void main(String[] args) {
        try {
            AppointmentRepository appointmentRepo = new AppointmentRepository();
            Appointment appointment = new Appointment(new User("name", "email", 20, "password", UserType.Vet, "3278697"), "clinic", "description", new Pet("name", Species.Cat, 2.0, 2374984, 2.0, 2.0, 2.0, LocalDate.now(), new User("name", "email", 20, "password", UserType.Vet, "3278697"), "37987"), "title", LocalDateTime.now(), "437896");
            appointmentRepo.addObject(appointment);
            Appointment appointment2 = new Appointment(new User("name2", "email", 20, "password", UserType.Vet, "3278697"), "clinic", "description", new Pet("name", Species.Cat, 2.0, 2374984, 2.0, 2.0, 2.0, LocalDate.now(), new User("name", "email", 20, "password", UserType.Vet, "3278697"), "37987"), "title2", LocalDateTime.now(), "4378962");
            appointmentRepo.addObject(appointment2);
            ArrayList<Identifiable> apps = appointmentRepo.getObjects();
            for (Identifiable id : apps) {
                Appointment appCasted = (Appointment) id;
                System.out.println(appCasted.getTitle());
            }

            PetRepository PetRepo = new PetRepository();
            Pet pet = new Pet("name", Species.Cat, 2.0, 2374984, 2.0, 2.0, 2.0, LocalDate.now(), new User("name", "email", 20, "password", UserType.Vet, "3278697"), "37987");
            PetRepo.addObject(pet);
            Pet pet2 = new Pet("name2", Species.Cat, 2.0, 2374984, 2.0, 2.0, 2.0, LocalDate.now(), new User("name", "email", 20, "password", UserType.Vet, "3278697"), "37987");
            PetRepo.addObject(pet2);
            ArrayList<Identifiable> apps2 = PetRepo.getObjects();
            for (Identifiable id : apps2) {
                Pet appCasted = (Pet) id;
                System.out.println(appCasted.getName());
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}