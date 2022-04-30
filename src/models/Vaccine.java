package models;

public class Vaccine extends Identifiable {
    private String name;
    private String imagePath;

    public Vaccine(String name, String imagePath, String id) {
        super(id);
        this.name = name;
        this.imagePath = imagePath;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    @Override
    public boolean equals (Object obj){
        if (!super.equals(obj)){
            return false;
        }
        if (obj instanceof Vaccine){
            Vaccine symptomObj = (Vaccine)obj;
            if (!symptomObj.getName().equals(this.getName())){
                return false;
            }
            else if (!symptomObj.getImagePath().equals(this.getImagePath())){
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
