package repositories;

import java.util.ArrayList;

import models.Identifiable;
import models.Medication;

public class MedicationRepository extends Repository {

    public MedicationRepository() {
        super();
    }


  public ArrayList<Medication> getMedicationsList() throws Exception {
        ArrayList<Medication> castedArray = new ArrayList<Medication>();
        for (Identifiable identifiable : this.getObjects()) {
            Medication castedMedication = (Medication) identifiable;
            castedArray.add(castedMedication);
        }
        return castedArray;
    }
}