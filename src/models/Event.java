package models;

import java.time.LocalDateTime;

public abstract class Event extends Listable {
    private Pet pet;

    public Event(Pet pet, String title, String subtitle, LocalDateTime date, String id) {
        super(title, subtitle, date, id);
        this.pet = pet;
    }

    public Pet getPet() {
        return this.pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }


    @Override
    public boolean equals(Object obj){
        if(!super.equals(obj)){
            return false;
        }       
        if (obj instanceof Event){
            Event eventObj = (Event)obj;
            if(!eventObj.getPet().equals(this.getPet())){
                return false;
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }
    }
}
