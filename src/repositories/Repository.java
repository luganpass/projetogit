package repositories;

import java.util.ArrayList;

import helpers.DatabaseCommunication.DataBaseCommunication;
import helpers.Exceptions.ObjectNotFoundException;
import models.Identifiable;

public abstract class Repository {
    private ArrayList<Identifiable> objects;
    private String filePath;

    public Repository() {
        this.filePath = DataBaseCommunication.createDataBaseFor(Repository.class.getName());
        this.objects = DataBaseCommunication.getObjectsFromDataBase(this.filePath);
    }

    public ArrayList<Identifiable> getObjects() {
        return this.objects;
    }

    public void setObjects(ArrayList<Identifiable> objects) {
        this.objects = objects;
    }

    public String getFilePath() {
        return this.filePath;
    }
    
    public void addObject(Identifiable object) throws Exception {
        this.objects.add(object);
        DataBaseCommunication.addObject(object, this.filePath);
    }

    public void removeObject(Identifiable object) throws Exception {
        if(!DataBaseCommunication.removeObjectWithId(object.getId(), this.filePath)) {
            throw new ObjectNotFoundException(object);
        } else if (!this.objects.remove(object)) {
            throw new ObjectNotFoundException(object);
        }
    }

    public void editObject(Identifiable oldObject, Identifiable newObject) throws Exception {
        this.removeObject(oldObject);
        this.addObject(newObject);
    }
}
