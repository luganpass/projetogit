package controllers;

import java.util.ArrayList;
import java.util.stream.Collectors;

import models.Pet;
import models.User;
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
    public ArrayList<Pet> getPetsListFromNewerToOlder() throws Exception {
        return petRepository.getPetsListFromNewerToOlder();
    }
    public ArrayList<Pet> getPetsFromUser(User user) throws Exception {
        return new ArrayList<Pet>(petRepository.getPetsListFromNewerToOlder().stream().filter((pet) -> { return pet.getOwner().equals(user);}).collect(Collectors.toList()));
    }
}
