package models;

public class Medication extends Identifiable {
    private String name;
    private String imagePath;

    public Medication(String name, String imagePath, String id) {
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
        if (obj instanceof Medication){
            Medication medicationObj = (Medication)obj;
            if (!medicationObj.getName().equals(this.getName())){
                return false;
            }
            else if (!medicationObj.getImagePath().equals(this.getImagePath())){
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
