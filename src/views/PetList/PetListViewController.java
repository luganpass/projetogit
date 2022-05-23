package views.PetList;

import java.util.ArrayList;
import java.util.stream.Collectors;

import controllers.PetController;
import controllers.SessionController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * 'PetListView.fxml' Controller Class
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import models.Pet;

public class PetListViewController {

    private SessionController sessionController = new SessionController();
    private PetController petController = new PetController();
    private Stage stage;
    private Scene scene;
    private Parent root;
    private ArrayList<Pet> myPetList;

    @FXML // fx:id="addPetButton"
    private Button addPetButton; // Value injected by FXMLLoader

    @FXML // fx:id="logoutButton"
    private Button logoutButton; // Value injected by FXMLLoader

    @FXML // fx:id="petListView"
    private ListView<String> petListView; // Value injected by FXMLLoader

    @FXML
    void addPet(ActionEvent event) {

    }

    @FXML
    protected void initialize() {
        try {
            myPetList = petController.getPetsFromUser(sessionController.getActiveSession().CURRENT_USER);
            ObservableList<String> myPetNameList = FXCollections.observableArrayList(myPetList.stream().map((pet) -> {return pet.getName();}).collect(Collectors.toList()));
            petListView.setItems(myPetNameList);
            petListView.setOrientation(Orientation.VERTICAL);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @FXML
    void logoutAction(ActionEvent event) {
        try {
            if(sessionController.logout()) {
                root = FXMLLoader.load(getClass().getResource("../Login/LoginView.fxml"));
                stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @FXML
    void onEditPet(ActionEvent event) {

    }

}
