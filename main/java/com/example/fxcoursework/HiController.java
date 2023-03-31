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

public class HiController implements Initializable {


	@FXML
    private ComboBox<String> comboDay;

    @FXML
    private ComboBox<String> comboDoc;
	
    @FXML
    private TableColumn<CardioDocs, String> day;

    @FXML
    private TableColumn<CardioDocs, String> docName;

    @FXML
    private TableView<CardioDocs> endo;

    @FXML
    private TableColumn<CardioDocs, String> time;

    @FXML
    private Button backcate;

    @FXML
    private Button makeanAppo;





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        comboDoc.getItems().addAll("Dr. Sunil Hettige", "Dr. Lewis Hamilton", "Dr. Micheal Angelo", "Dr. Roger Federer", "Dr. Tim Burton");
		comboDay.getItems().addAll("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");

		
		//Column fxid                                       <Class name, Data type> ("variable name in class")
        docName.setCellValueFactory(new PropertyValueFactory<CardioDocs, String>("doctorName"));
        day.setCellValueFactory(new PropertyValueFactory<CardioDocs, String>("day"));
        time.setCellValueFactory(new PropertyValueFactory<CardioDocs, String>("time"));

        //displaying object data in table



        endo.setItems(getEndo());
    }

    //Info for Cardio object (Returns an observablelist of cardio objects)


    public ObservableList<CardioDocs> getEndo() {

        ObservableList<CardioDocs> doctors = FXCollections.observableArrayList();

        doctors.add(new CardioDocs("Dr. Sunil Hettige", "Monday", "9.00am - 4.00pm"));
        doctors.add(new CardioDocs("Dr. Lewis Hamilton", "Tuesday", "10.00am - 6.00pm"));
        doctors.add(new CardioDocs("Dr. Micheal Angelo", "Wednesday", "10.00am - 6.00pm"));
        doctors.add(new CardioDocs("Dr. Roger Federer", "Thursday", "8.00am - 3.00pm"));
        doctors.add(new CardioDocs("Dr. Tim Burton", "Friday", "8.00am - 2.00pm"));
        doctors.add(new CardioDocs("Dr. Sunil Hettige", "Saturday", "8.00am - 5.00pm"));

        return doctors;
    }



    @FXML
    void BacktoCate(ActionEvent event) throws IOException {

        Stage stage = (Stage) backcate.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("categories.fxml"));
        primaryStage.setTitle("fill your details");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }



    @FXML
    void gotoAppo(ActionEvent event)throws IOException {

        Stage stage = (Stage) makeanAppo.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Details.fxml"));
        primaryStage.setTitle("fill your details");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

}
