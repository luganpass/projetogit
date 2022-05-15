package controllers;

import models.Medication;
import repositories.MedicationRepository;

public class MedicationController {
    private static MedicationRepository medicationRepository = new MedicationRepository();

    public void addMedication (Medication m) throws Exception{
        medicationRepository.addObject(m);
    }
    public void removeMedication (Medication m) throws Exception{
        medicationRepository.removeObject(m);
    }
    public void editMedication (Medication m1, Medication m2) throws Exception{
        medicationRepository.editObject(m1, m2);
    }
}
