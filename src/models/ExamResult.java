package models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExamResult extends Listable {
    private String title;
    private User vet;
    private String clinic;
    private String results;

    public ExamResult(String title, User vet, String clinic, String results, LocalDateTime date, String id) {
        super(title, date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")), date, id);
        this.title = title;
        this.vet = vet;
        this.clinic = clinic;
        this.results = results;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getVet() {
        return this.vet;
    }

    public void setVet(User vet) {
        this.vet = vet;
    }

    public String getClinic() {
        return this.clinic;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }

    public String getResults() {
        return this.results;
    }

    public void setResults(String results) {
        this.results = results;
    }
    @Override
    public boolean equals (Object obj){
        if(!super.equals(obj)){
            return false;
        }
        if (obj instanceof ExamResult){
            ExamResult examResultObj = (ExamResult)obj;
            if (!examResultObj.getClinic().equals(this.getClinic())){
                return false; 
            }
            else if (!examResultObj.getTitle().equals(this.getTitle())){
                return false;
            }
            else if (!examResultObj.getVet().equals(this.getVet())){
                return false;
            }
            else if (!examResultObj.getResults().equals(this.getResults())){
                return false;
            }
            else{
                return true;
            }
        }
        else {
            return false;
        }
    }


}
