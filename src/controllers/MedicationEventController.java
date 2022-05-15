package controllers;

import models.MedicationEvent;
import repositories.MedicationEventRepository;

public class MedicationEventController {
    private static MedicationEventRepository medicationEventRepository = new MedicationEventRepository();

    public void addMedicationEvent (MedicationEvent me) throws Exception{
        medicationEventRepository.addObject(me);
    }
    public void removeMedicationEvent (MedicationEvent me) throws Exception{
        medicationEventRepository.removeObject(me);
    }
    public void editMedicationEvent (MedicationEvent me1, MedicationEvent me2) throws Exception{
        medicationEventRepository.editObject(me1, me2);
    }
}