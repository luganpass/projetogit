package helpers.DatabaseCommunication;

import com.google.gson.*;

import java.util.ArrayList;

import models.Identifiable;

public class DataBaseCommunication {
    public static String createDataBaseFor(String repositoryName) {
        //TO-DO
        Gson gson = new Gson();
        return "";
    }
    public static ArrayList<Identifiable> getObjectsFromDataBase(String filePath) {
        //TO-DO
        return new ArrayList<Identifiable>();
    }
    public static boolean removeObjectWithId(String objectId, String filePath) throws Exception {
        //TO-DO
        return true;
    }
    public static void addObject(Identifiable object, String filePath) throws Exception {
        //TO-DO
    }
}
