package com.example.fxcoursework;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HireController implements Initializable {

		@FXML
		private ComboBox<String> comboday;

		@FXML
		private ComboBox<String> combodocs;
        
		@FXML
        private TableView<CardioDocs> cardio;

        @FXML
        private TableColumn<CardioDocs, String> day;

        @FXML
        private TableColumn<CardioDocs, String> docName;

        @FXML
        private TableColumn<CardioDocs, String> time;
        @FXML
        private Button setAppointment;

        @FXML
        private Button backoptions;


    public void initialize(URL url, ResourceBundle resourceBundle) {
		
		combodocs.getItems().addAll("Dr. Jakkas Nandu", "Dr. Hugh Jass", "Dr. Karen Central", "Dr. Kamal Sumanasiri");
		comboday.getItems().addAll("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");

        //Column fxid                                       <Class name, Data type> ("variable name in class")
        docName.setCellValueFactory(new PropertyValueFactory<CardioDocs, String>("doctorName"));
        day.setCellValueFactory(new PropertyValueFactory<CardioDocs, String>("day"));
        time.setCellValueFactory(new PropertyValueFactory<CardioDocs, String>("time"));

        //displaying object data in table

        cardio.setItems(getCardio());
    }


    private ObservableList<CardioDocs> getCardio() {
        ObservableList<CardioDocs> doctors = FXCollections.observableArrayList();

        doctors.add(new CardioDocs("Dr. Jakkas Nandu", "Monday", "9.00am - 4.00pm"));
        doctors.add(new CardioDocs("Dr. Hugh Jass", "Tuesday", "10.00am - 6.00pm"));
        doctors.add(new CardioDocs("Dr. Karen Central", "Wednesday", "10.00am - 6.00pm"));
        doctors.add(new CardioDocs("Dr. Kamal Sumanasiri", "Thursday", "8.00am - 3.00pm"));
        doctors.add(new CardioDocs("Dr. Jakkas Nandu", "Friday", "8.00am - 2.00pm"));
        doctors.add(new CardioDocs("Dr. Kamal Sumanasiri", "Saturday", "8.00am - 5.00pm"));

        return doctors;
    }




    @FXML
    void gotoAppoitment(ActionEvent event) throws IOException {

        Stage stage = (Stage) setAppointment.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Details.fxml"));
        primaryStage.setTitle("fill your details");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }



    @FXML
    void BacktoOptions(ActionEvent event) throws IOException{

        Stage stage = (Stage) backoptions.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("categories.fxml"));
        primaryStage.setTitle("fill your details");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }



}



