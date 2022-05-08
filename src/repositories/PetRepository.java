package repositories;

import java.util.ArrayList;
import java.util.Collections;

import models.Identifiable;
import models.Pet;

public class PetRepository extends Repository {

    public PetRepository() {
        super("PetRepository");
    }
    
    public ArrayList<Pet> getPetsListFromNewerToOlder() throws Exception {
        ArrayList<Pet> castedArray = new ArrayList<Pet>();
        for (Identifiable identifiable : this.getObjects()) {
            Pet castedPet = (Pet) identifiable;
            castedArray.add(castedPet);
        }
        Collections.sort(castedArray, Collections.reverseOrder((s0, s1) -> s0.getBirthDate().compareTo(s1.getBirthDate())));
        return castedArray;
    }
}
