package controllers;

import models.Diagnosis;
import repositories.DiagnosisRepository;

public class DiagnosisController {
    private static DiagnosisRepository diagnosisRepository = new DiagnosisRepository();
    
    public void addDiagnosis (Diagnosis di) throws Exception{
        diagnosisRepository.addObject(di);
    }
    public void removeDiagnosis (Diagnosis di) throws Exception {
        diagnosisRepository.removeObject(di);
    }
    public void editDiagnosis (Diagnosis di1, Diagnosis di2) throws Exception {
        diagnosisRepository.editObject(di1, di2);
    }
}


