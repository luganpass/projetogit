package controllers;

import models.VaccineEvent;
import repositories.VaccineEventRepository;

public class VaccineEventController {
    private static VaccineEventRepository vaccineEventRepository = new VaccineEventRepository();

    public void addVaccineEvent (VaccineEvent vac) throws Exception{
        vaccineEventRepository.addObject(vac);
    }
    public void removeVaccineEvent (VaccineEvent vac) throws Exception{
        vaccineEventRepository.removeObject(vac);
    }
    public void editVaccineEvent (VaccineEvent vac1, VaccineEvent vac2) throws Exception{
        vaccineEventRepository.editObject(vac1, vac2);
    }
}
