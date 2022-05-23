package controllers;

import helpers.Exceptions.LoginFailedException;
import helpers.Exceptions.UserAlreadyExistsException;
import helpers.Exceptions.UserNotFoundException;
import models.Identifiable;
import models.User;
import repositories.UserRepository;

public class UserController {
    private static UserRepository userRepository = new UserRepository();

    public static void addUser (User user) throws Exception{
        for (Identifiable identifiable : userRepository.getObjects()) {
            User castedUser = (User) identifiable;
            if (castedUser.getEmail()== user.getEmail()){
                throw new UserAlreadyExistsException(user.getEmail());
            }
        }
        userRepository.addObject(user);
    }
    public void removeUser (User user) throws Exception{
        userRepository.removeObject(user);
    }
    public void editUser (User user1, User user2) throws Exception{
        userRepository.editObject(user1, user2);
    }
    
    public static User checkUserAndPassword (String email, String password) throws Exception   {       
        for (Identifiable identifiable : userRepository.getObjects()) {
            User castedUser = (User) identifiable;
            if (castedUser.getEmail().equals(email)){
                if (castedUser.isPasswordCorrect(password)){
                    return castedUser;
                }
                else {
                    throw new LoginFailedException(email);
                }
            }
        }
        throw new UserNotFoundException(email);
    }
}
