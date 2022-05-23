package helpers.DatabaseCommunication;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;

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

public class DataBaseCommunication {
    static Gson gson = new Gson();
    public static String createDataBaseFor(String repositoryName) throws Exception {
        File file = new File(repositoryName + ".json");
        if(!file.exists()) {
            file.createNewFile();
            return file.getAbsolutePath();
        }
        return file.getAbsolutePath();
    }
    public static ArrayList<Identifiable> getObjectsFromDataBase(String filePath, Class className) throws Exception{
        JsonArray a = (JsonArray) JsonParser.parseReader(new FileReader(filePath));
        switch (className.getSimpleName()) {
            case "AppointmentRepository":
                Type appointmentsListType = new TypeToken<ArrayList<Appointment>>(){}.getType();
                ArrayList<Appointment> appointmentsArray = gson.fromJson(a, appointmentsListType);
                ArrayList<Identifiable> appointmentsResult = new ArrayList<Identifiable>();
                for (Identifiable obj : appointmentsArray) {
                    appointmentsResult.add(obj);
                }
                return appointmentsResult;
            case "DiagnosisRepository":
                Type diagnosisListType = new TypeToken<ArrayList<Diagnosis>>(){}.getType();
                ArrayList<Diagnosis> diagnosisArray = gson.fromJson(a, diagnosisListType);
                ArrayList<Identifiable> diagnosisResult = new ArrayList<Identifiable>();
                for (Identifiable obj : diagnosisArray) {
                    diagnosisResult.add(obj);
                }
                return diagnosisResult;
            case "ExamResult":
                Type examResultsListType = new TypeToken<ArrayList<ExamResult>>(){}.getType();
                ArrayList<ExamResult> examResultsArray = gson.fromJson(a, examResultsListType);
                ArrayList<Identifiable> examsResultsResult = new ArrayList<Identifiable>();
                for (Identifiable obj : examResultsArray) {
                    examsResultsResult.add(obj);
                }
                return examsResultsResult;
            case "ListableRepository":
                Type listablesListType = new TypeToken<ArrayList<Listable>>(){}.getType();
                ArrayList<Listable> listablesArray = gson.fromJson(a, listablesListType);
                ArrayList<Identifiable> listablesResult = new ArrayList<Identifiable>();
                for (Identifiable obj : listablesArray) {
                    listablesResult.add(obj);
                }
                return listablesResult;
            case "MedicationEventRepository":
                Type medicationEventsListType = new TypeToken<ArrayList<MedicationEvent>>(){}.getType();
                ArrayList<MedicationEvent> medicationEventsArray = gson.fromJson(a, medicationEventsListType);
                ArrayList<Identifiable> medicationEventResult = new ArrayList<Identifiable>();
                for (Identifiable obj : medicationEventsArray) {
                    medicationEventResult.add(obj);
                }
                return medicationEventResult;
            case "MedicationRepository":
                Type medicationsListType = new TypeToken<ArrayList<Medication>>(){}.getType();
                ArrayList<Medication> medicationsArray = gson.fromJson(a, medicationsListType);
                ArrayList<Identifiable> medicationsResult = new ArrayList<Identifiable>();
                for (Identifiable obj : medicationsArray) {
                    medicationsResult.add(obj);
                }
                return medicationsResult;
            case "PetRepository":
                Type petsListType = new TypeToken<ArrayList<Pet>>(){}.getType();
                ArrayList<Pet> petsArray = gson.fromJson(a, petsListType);
                ArrayList<Identifiable> petsResult = new ArrayList<Identifiable>();
                for (Identifiable obj : petsArray) {
                    petsResult.add(obj);
                }
                return petsResult;
            case "Identifiable":
                Type identifiablesListType = new TypeToken<ArrayList<Identifiable>>(){}.getType();
                ArrayList<Identifiable> identifiablesArray = gson.fromJson(a, identifiablesListType);
                ArrayList<Identifiable> identifiablesResult = new ArrayList<Identifiable>();
                for (Identifiable obj : identifiablesArray) {
                    identifiablesResult.add(obj);
                }
                return identifiablesResult;
            case "Session":
                Type sessionsListType = new TypeToken<ArrayList<Session>>(){}.getType();
                ArrayList<Identifiable> sessionsArray = gson.fromJson(a, sessionsListType);
                ArrayList<Identifiable> sessionsResult = new ArrayList<Identifiable>();
                for (Identifiable obj : sessionsArray) {
                    sessionsResult.add(obj);
                }
                return sessionsResult;
            case "SymptomRepository":
                Type symptomsListType = new TypeToken<ArrayList<Symptom>>(){}.getType();
                ArrayList<Identifiable> symptomsArray = gson.fromJson(a, symptomsListType);
                ArrayList<Identifiable> symptomsResult = new ArrayList<Identifiable>();
                for (Identifiable obj : symptomsArray) {
                    symptomsResult.add(obj);
                }
                return symptomsResult;
            case "UserRepository":
                Type usersListType = new TypeToken<ArrayList<User>>(){}.getType();
                ArrayList<Identifiable> usersArray = gson.fromJson(a, usersListType);
                ArrayList<Identifiable> usersResult = new ArrayList<Identifiable>();
                for (Identifiable obj : usersArray) {
                    usersResult.add(obj);
                }
                return usersResult;
            case "VaccineEventRepository":
                Type vaccineEventsListType = new TypeToken<ArrayList<VaccineEvent>>(){}.getType();
                ArrayList<Identifiable> vaccineEventsArray = gson.fromJson(a, vaccineEventsListType);
                ArrayList<Identifiable> vaccineEventsResult = new ArrayList<Identifiable>();
                for (Identifiable obj : vaccineEventsArray) {
                    vaccineEventsResult.add(obj);
                }
                return vaccineEventsResult;
            case "VaccineRepository":
                Type vaccinesListType = new TypeToken<ArrayList<Vaccine>>(){}.getType();
                ArrayList<Identifiable> vaccinesArray = gson.fromJson(a, vaccinesListType);
                ArrayList<Identifiable> vaccinesResult = new ArrayList<Identifiable>();
                for (Identifiable obj : vaccinesArray) {
                    vaccinesResult.add(obj);
                }
                return vaccinesResult;
            default:
                Type identifiablesListType2 = new TypeToken<ArrayList<Identifiable>>(){}.getType();
                ArrayList<Identifiable> identifiablesArray2 = gson.fromJson(a, identifiablesListType2);
                ArrayList<Identifiable> identifiablesResult2 = new ArrayList<Identifiable>();
                for (Identifiable obj : identifiablesArray2) {
                    identifiablesResult2.add(obj);
                }
                return identifiablesResult2;
        }
        
    }
    public static void save(ArrayList<Identifiable> objects, String filePath) throws Exception {
            Writer writer = new FileWriter(filePath);
            gson.toJson(objects, writer);
            writer.close();
    }
}
