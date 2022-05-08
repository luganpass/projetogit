package repositories;

import java.util.ArrayList;

import helpers.DatabaseCommunication.DataBaseCommunication;
import helpers.Exceptions.ObjectNotFoundException;
import models.Identifiable;

public abstract class Repository {
    private ArrayList<Identifiable> objects = new ArrayList<Identifiable>();
    private String filePath;

    public Repository(String repositoryName) {
        try {
            this.filePath = DataBaseCommunication.createDataBaseFor(repositoryName);
            this.objects = DataBaseCommunication.getObjectsFromDataBase(this.filePath, this.getClass());
        } catch (Exception e) {
            System.out.println(e);
        }
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
        DataBaseCommunication.save(this.objects, this.filePath);
    }

    public void removeObject(Identifiable object) throws Exception {
        if (!this.objects.remove(object)) {
            throw new ObjectNotFoundException(object);
        } else {
            DataBaseCommunication.save(this.objects, this.filePath);
        }
    }

    public void editObject(Identifiable oldObject, Identifiable newObject) throws Exception {
        this.removeObject(oldObject);
        this.addObject(newObject);
    }
}
