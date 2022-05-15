package controllers;

import models.Vaccine;
import repositories.VaccineRepository;

public class VaccineController {
    private static VaccineRepository vaccineRepository = new VaccineRepository();

    public void addVaccine (Vaccine vac) throws Exception{
        vaccineRepository.addObject(vac);
    }
    public void removeVaccine (Vaccine vac) throws Exception{
        vaccineRepository.removeObject(vac);
    }
    public void editVaccine (Vaccine vac1, Vaccine vac2) throws Exception{
        vaccineRepository.editObject(vac1, vac2);
    }
}
