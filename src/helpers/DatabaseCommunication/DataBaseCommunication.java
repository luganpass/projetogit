package helpers.DatabaseCommunication;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import helpers.Enums.RepositoryToModel;

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
import models.MedicationEvent;
import repositories.AppointmentRepository;

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
                Type medicationEventsListType = new TypeToken<ArrayList<Listable>>(){}.getType();
                ArrayList<MedicationEvent> medicationEventssArray = gson.fromJson(a, medicationEventsListType);
                ArrayList<Identifiable> medicationEventResult = new ArrayList<Identifiable>();
                for (Identifiable obj : medicationEventssArray) {
                    medicationEventResult.add(obj);
                }
                return medicationEventResult;
            // case 6:
            //     return new TypeToken<Medication>(){}.getType();
            // case 7:
            //     return new TypeToken<Pet>(){}.getType();
            // case 8:
            //     return new TypeToken<Identifiable>(){}.getType();
            // case 9:
            //     return new TypeToken<Session>(){}.getType();
            // case 10:
            //     return new TypeToken<Symptom>(){}.getType();
            // case 11:
            //     return new TypeToken<User>(){}.getType();
            // case 12:
            //     return new TypeToken<VaccineEvent>(){}.getType();
            // case 13:
            //     return new TypeToken<Vaccine>(){}.getType();
            default:
                Type identifiablesListType = new TypeToken<ArrayList<Listable>>(){}.getType();
                ArrayList<Identifiable> identifiablesArray = gson.fromJson(a, identifiablesListType);
                ArrayList<Identifiable> identifiablesResult = new ArrayList<Identifiable>();
                for (Identifiable obj : identifiablesArray) {
                    identifiablesResult.add(obj);
                }
                return identifiablesResult;
        }
        
    }
    public static void save(ArrayList<Identifiable> objects, String filePath) throws Exception {
            Writer writer = new FileWriter(filePath);
            gson.toJson(objects, writer);
            writer.close();
    }
}
