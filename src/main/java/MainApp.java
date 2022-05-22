package main.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../../views/Login/LoginView.fxml"));
        Parent root = fxmlLoader.load();
        Scene loginScreen = new Scene(root,600,400);
        primaryStage.setTitle("Pet Admin");
        primaryStage.setScene(loginScreen); 
        primaryStage.show(); 
    }  
    public static void main(String[] args) {
        launch(args);
    }
}
