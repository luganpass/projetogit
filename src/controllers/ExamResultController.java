package controllers;

import models.ExamResult;
import repositories.ExamResultRepository;

public class ExamResultController {
    private static ExamResultRepository examResultRepository = new ExamResultRepository();
    
    public void addExamResult (ExamResult er) throws Exception{
        examResultRepository.addObject(er);
    }
    public void removeExamResult (ExamResult er) throws Exception {
        examResultRepository.removeObject(er);
    }
    public void editExamResult (ExamResult er1, ExamResult er2) throws Exception {
        examResultRepository.editObject(er1, er2);
    }
}
