package com.example.fxcoursework;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HeyController implements Initializable {

    @FXML
    private ListView listView;

    @FXML
    private Button makescApp;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listView.getItems().addAll("XRay", "PET Scan", "CAT Scan", "ECG", "MRI Scan");
    }


    @FXML
    void gotoScApp(ActionEvent event) throws IOException {

        Stage stage = (Stage) makescApp.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Details.fxml"));
        primaryStage.setTitle("fill your details");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }


    @FXML
    void BactotheSec(ActionEvent event) throws IOException{

        Stage stage = (Stage) makescApp.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("categories.fxml"));
        primaryStage.setTitle("fill your details");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

}
