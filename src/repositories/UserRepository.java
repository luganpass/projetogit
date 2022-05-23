package repositories;

import helpers.DatabaseCommunication.DataBaseCommunication;
import helpers.Exceptions.UserAlreadyExistsException;
import helpers.Exceptions.UserNotFoundException;
import models.Identifiable;
import models.User;

public class UserRepository extends Repository {

    public UserRepository() {
        super("UserRepository");
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
        User userToAdd = (User) object;
        for (Identifiable identifiable : this.getObjects()) {
            User castedUser = (User) identifiable;
            if (castedUser.getEmail()== userToAdd.getEmail()){
                throw new UserAlreadyExistsException(userToAdd.getEmail());
            }
        }
        super.addObject(object);
    }
}