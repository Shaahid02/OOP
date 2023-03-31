package com.example.fxcoursework;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;


public class HelloController {



    @FXML
    private Button finddoctor;

    @FXML
    private Button Cardio;

    @FXML
    private Button OPd;

    @FXML
    private Button Physician;

    @FXML
    private Button Skin;

    @FXML
    private Button Back;

    @FXML
    private Button ViewDetail;

    @FXML
    private Button submitbtn;

    @FXML
    private Button backrecoreection;

    @FXML
    private Button SCAN;

    @FXML
    private Button backtosec;




    @FXML
    void goToCategories(ActionEvent event) throws IOException {

        Stage stage = (Stage) finddoctor.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("categories.fxml"));
        primaryStage.setTitle("find what you need");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    @FXML
    void Cardiosection(ActionEvent event) throws IOException{

        Stage stage = (Stage) Cardio.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("doc.fxml"));
        primaryStage.setTitle("find your doctor");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    @FXML
    void Opdsection(ActionEvent event) throws IOException{

        Stage stage = (Stage) OPd.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("doc2.fxml"));
        primaryStage.setTitle("find your doctor");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }


    @FXML
    void Physection(ActionEvent event) {

    }

    @FXML
    void SkinSection(ActionEvent event) {

    }

    @FXML
    void goScanSec(ActionEvent event) throws IOException{

        Stage stage = (Stage) SCAN.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("scans.fxml"));
        primaryStage.setTitle("fill your details");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }



    @FXML
    void gotoScApp(ActionEvent event) throws IOException{

        Stage stage = (Stage) SCAN.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("categories.fxml"));
        primaryStage.setTitle("fill your details");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

}
