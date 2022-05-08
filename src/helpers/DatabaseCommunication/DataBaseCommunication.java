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
import models.Identifiable;

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
        Type objectsListType = new TypeToken<ArrayList<Appointment>>(){}.getType();
        System.out.println("TEST");
        System.out.println(className);
        ArrayList<Appointment> objectsArray = gson.fromJson(a, objectsListType);
        ArrayList<Identifiable> result = new ArrayList<Identifiable>();
        for (Appointment obj : objectsArray) {
            result.add(obj);
        }
        return result;
    }
    public static void save(ArrayList<Identifiable> objects, String filePath) throws Exception {
            Writer writer = new FileWriter(filePath);
            gson.toJson(objects, writer);
            writer.close();
    }
}
