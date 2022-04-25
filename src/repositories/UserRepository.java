package repositories;

import java.util.ArrayList;

import models.Identifiable;
import models.User;

public class UserRepository extends Repository {

    public UserRepository() {
        super();
    }

   public boolean login (String email, String password) throws Exception   {
        for (Identifiable identifiable : this.getObjects()) {
            User castedUser = (User) identifiable;
            if (castedUser.getEmail()== email){
                return castedUser.isPasswordCorrect(password);
            }
        }
        throw new UserNotFoundException(email);
    }

    @Override
    public void addObject(Identifiable object) throws Exception {
        User userToAdd = (User) identifiable;
        for (Identifiable identifiable : this.getObjects()) {
            User castedUser = (User) identifiable;
            if (castedUser.getEmail()== userToAdd.getEmail()){
                throw new UserAlreadyExistsException(userToAdd.getEmail());
            }
        }
        this.objects.add(object);
        DataBaseCommunication.addObject(object, this.filePath);
    }
}