package com.example.fxcoursework;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class FinalController {

    @FXML
    private Button backrecoreection;

    @FXML
    private TextField getAge;

    @FXML
    private TextField getGen;

    @FXML
    private TextField getName1;

    @FXML
    private TextField getNic;

    @FXML
    private TextField getNum;
	
	 @FXML
    private TextField getDate;

    @FXML
    private TextField getDoctor;

    @FXML
    private Button submitbtn;

    @FXML
    void gotofilldetail(ActionEvent event) throws IOException {
        Stage stage = (Stage) backrecoreection.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Details.fxml"));
        primaryStage.setTitle("fill your details");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    @FXML
    void makealert(ActionEvent event) {
		Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Healthcare Medical Centre");
        alert.setHeaderText("Appointment Confirmation");
        alert.setContentText("Your appointment has been confirmed \n Your token: #17");
        alert.showAndWait();

    }
	
	public void displayDetails(String name, String age_yrs, String nic_num, String cont_num, String appt_doc, String appt_date,String gender){
        getName1.setText(name);
		getAge.setText(age_yrs);
		getNic.setText(nic_num);
		getNum.setText(cont_num);
		getDoctor.setText(appt_doc);
		getDate.setText(appt_date);
		getGen.setText(gender);


	}
	
	

}
