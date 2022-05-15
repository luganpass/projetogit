package controllers;

import models.Pet;
import repositories.PetRepository;

public class PetController {
    private static PetRepository petRepository = new PetRepository();

    public void addPet (Pet p) throws Exception{
        petRepository.addObject(p);
    }
    public void removePet (Pet p) throws Exception{
        petRepository.removeObject(p);
    }
    public void editPet (Pet p1, Pet p2) throws Exception{
        petRepository.editObject(p1, p2);
    }
}
