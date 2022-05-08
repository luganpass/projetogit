package repositories;

import java.util.ArrayList;
import java.util.Collections;

import models.Identifiable;
import models.Listable;

public abstract class ListableRepository extends Repository {

    public ListableRepository(String repositoryName) {
        super(repositoryName);
    }
    
    public ArrayList<Listable> getPetsListFromNewerToOlder() throws Exception {
        ArrayList<Listable> castedArray = new ArrayList<Listable>();
        for (Identifiable identifiable : this.getObjects()) {
            Listable castedPet = (Listable) identifiable;
            castedArray.add(castedPet);
        }
        Collections.sort(castedArray, Collections.reverseOrder((s0, s1) -> s0.getDate().compareTo(s1.getDate())));
        return castedArray;
    }
    
}
