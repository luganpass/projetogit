package views.PetList;

/**
 * 'PetListView.fxml' Controller Class
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class PetListViewController {

    @FXML // fx:id="addPetButton"
    private Button addPetButton; // Value injected by FXMLLoader

    @FXML // fx:id="logoutButton"
    private Button logoutButton; // Value injected by FXMLLoader

    @FXML // fx:id="petListView"
    private ListView<?> petListView; // Value injected by FXMLLoader

    @FXML
    void addPet(ActionEvent event) {

    }

    @FXML
    void logoutAction(ActionEvent event) {

    }

    @FXML
    void onEditPet(ActionEvent event) {

    }

}
