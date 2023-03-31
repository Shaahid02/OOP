package com.example.fxcoursework;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DetailsController{

    @FXML
    private Button Back;

    @FXML
    private TextField Name1;

    @FXML
    private Button ViewDetail;

    @FXML
    private TextField age;

    @FXML
    private TextField date;

    @FXML
    private TextField doctor;

    @FXML
    private RadioButton female;

    @FXML
    private RadioButton male;

    @FXML
    private TextField nic;

    @FXML
    private TextField num;
	
	private Stage stage;
	private Scene scene;
	private Parent root;

    @FXML
    public void Gofinaldetail(ActionEvent event) throws IOException {
		String name = Name1.getText();
		String age_yrs = age.getText();
		String nic_num = nic.getText();
		String cont_num = num.getText();
		String appt_doc = doctor.getText();
		String appt_date = date.getText();
		
		String gender;{
            if(male.isSelected()){
                gender = "M";

            }

            else{
                gender = "F";
            }
        }

		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("final.fxml"));
		root = loader.load();
		
		FinalController finalcontroller = loader.getController();
		finalcontroller.displayDetails(name, age_yrs, nic_num, cont_num, appt_doc, appt_date, gender);
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }

    @FXML
    void Gotosections(ActionEvent event) throws IOException{


        Stage stage = (Stage) Back.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("categories.fxml"));
        primaryStage.setTitle("find what you need");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    
}
