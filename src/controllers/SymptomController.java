package controllers;

import models.Symptom;
import repositories.SymptomRepository;

public class SymptomController {
    private static SymptomRepository symptomRepository = new SymptomRepository();

    public void addSymptom (Symptom sy) throws Exception{
        symptomRepository.addObject(sy);
    }
    public void removeSymptom (Symptom sy) throws Exception{
        symptomRepository.removeObject(sy);
    }
    public void editSymptom (Symptom sy1, Symptom sy2) throws Exception{
        symptomRepository.editObject(sy1, sy2);
    }
}
