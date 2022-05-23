package models;

public abstract class Identifiable {
    private String id;

    public Identifiable(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals (Object obj){
        if (obj instanceof Identifiable){
            Identifiable identifiableObj = (Identifiable)obj;
            System.out.println(identifiableObj.getId());
            System.out.println(this.getId());
            if (!identifiableObj.getId().equals(this.getId())){
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
