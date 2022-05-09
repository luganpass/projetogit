package helpers.Enums;
import java.lang.reflect.Type;

import com.google.gson.reflect.TypeToken;

import models.Appointment;
import models.Diagnosis;
import models.ExamResult;
import models.Identifiable;
import models.Listable;
import models.Medication;
import models.MedicationEvent;
import models.Pet;
import models.Session;
import models.Symptom;
import models.User;
import models.Vaccine;
import models.VaccineEvent;

public enum RepositoryToModel {
    AppointmentRepository(1),
    DiagnosisRepository(2),
    ExamResultRepository(3),
    ListableRepository(4),
    MedicationEventRepository(5),
    MedicationRepository(6),
    PetRepository(7),
    Repository(8),
    SessionRepository(9),
    SimptomRepository(10),
    UserRepository(11),
    VaccineEventRepository(12),
    VaccineRepository(13);

    private final int value;

    RepositoryToModel(int optionValue) {
        this.value = optionValue;
    }

    public Type getTypeOfModel() {
        switch (this.value) {
            case 1:
                return new TypeToken<Appointment>(){}.getType();
            case 2:
                return new TypeToken<Diagnosis>(){}.getType();
            case 3:
                return new TypeToken<ExamResult>(){}.getType();
            case 4:
                return new TypeToken<Listable>(){}.getType();
            case 5:
                return new TypeToken<MedicationEvent>(){}.getType();
            case 6:
                return new TypeToken<Medication>(){}.getType();
            case 7:
                return new TypeToken<Pet>(){}.getType();
            case 8:
                return new TypeToken<Identifiable>(){}.getType();
            case 9:
                return new TypeToken<Session>(){}.getType();
            case 10:
                return new TypeToken<Symptom>(){}.getType();
            case 11:
                return new TypeToken<User>(){}.getType();
            case 12:
                return new TypeToken<VaccineEvent>(){}.getType();
            case 13:
                return new TypeToken<Vaccine>(){}.getType();
            default:
                return new TypeToken<Identifiable>(){}.getType();
        }
    }
}
