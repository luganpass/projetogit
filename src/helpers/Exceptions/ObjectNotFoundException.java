package helpers.Exceptions;

import models.Identifiable;

public class ObjectNotFoundException extends Exception {
    private Identifiable object;

    public ObjectNotFoundException(Identifiable object) {
        super("Objeto " + object.getId() + " não encontrado");
        this.object = object;
    }

    public Identifiable getObject() {
        return this.object;
    }

    public void setObject(Identifiable object) {
        this.object = object;
    }
    
}
