package views.Login;

import controllers.PetController;
import controllers.SessionController;
import controllers.UserController;
import helpers.Enums.Species;
import helpers.Enums.UserType;

import java.io.IOException;
import java.time.LocalDate;
import java.util.UUID;

/**
 * Sample Skeleton for 'LoginView.fxml' Controller Class
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.Pet;
import models.User;

public class LoginViewController {

    private SessionController sessionController = new SessionController();
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML // fx:id="emailTextField"
    private TextField emailTextField; // Value injected by FXMLLoader

    @FXML // fx:id="goToSignUpButton"
    private Button goToSignUpButton; // Value injected by FXMLLoader

    @FXML // fx:id="loginButton"
    private Button loginButton; // Value injected by FXMLLoader

    @FXML // fx:id="passwordTextField"
    private PasswordField passwordTextField; // Value injected by FXMLLoader

    @FXML
    void goToSignUp(ActionEvent event) {

    }

    @FXML
    void makeLogin(ActionEvent event) {
        try {
            // User testUser = new User("Usuário Teste", emailTextField.getText(), 29, passwordTextField.getText(), UserType.PetOwner, UUID.randomUUID().toString());
            // UserController.addUser(testUser);
            // Pet pet = new Pet("Pet Test", Species.Dog, 12.0, 4789378, 2.0, 2.0, 2.0, LocalDate.now(), testUser, UUID.randomUUID().toString());
            // PetController petController = new PetController();
            // petController.addPet(pet);
            if(sessionController.login(emailTextField.getText(), passwordTextField.getText())) {
                System.out.println("Login Success");
                goToPetList(event);
            } else {
                System.out.println("Login Failed");
            }
        } catch (Exception e) {
            System.out.println("Login Failed " + e.getMessage());
            e.printStackTrace();
        }
    }

    void goToPetList(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("../PetList/PetListView.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
