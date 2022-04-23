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

}
