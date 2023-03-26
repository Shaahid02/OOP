package com.example.assign;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TableView<CardioDocs> cardio;

    @FXML
    private TableColumn<CardioDocs, String> day;

    @FXML
    private TableColumn<CardioDocs, String> docName;

    @FXML
    private TableColumn<CardioDocs, String> time;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //Column fxid                                       <Class name, Data type> ("variable name in class")
        docName.setCellValueFactory(new PropertyValueFactory<CardioDocs, String>("doctorName"));
        day.setCellValueFactory(new PropertyValueFactory<CardioDocs, String>("day"));
        time.setCellValueFactory(new PropertyValueFactory<CardioDocs, String>("time"));

        //displaying object data in table



        cardio.setItems(getCardio());

    }



    //Info for Cardio object (Returns an observablelist of cardio objects)

    public ObservableList<CardioDocs> getCardio(){

        ObservableList<CardioDocs> doctors = FXCollections.observableArrayList();

        doctors.add(new CardioDocs("Dr. Jakkas Nandu", "Monday", "9.00am - 4.00pm"));
        doctors.add(new CardioDocs("Dr. Hugh Jass", "Tuesday", "10.00am - 6.00pm"));
        doctors.add(new CardioDocs("Dr. Karen Central", "Wednesday", "10.00am - 6.00pm"));
        doctors.add(new CardioDocs("Dr. Kamal Sumanasiri", "Thursday", "8.00am - 3.00pm"));
        doctors.add(new CardioDocs("Dr. Jakkas Nandu", "Friday", "8.00am - 2.00pm"));
        doctors.add(new CardioDocs("Dr. Kamal Sumanasiri", "Saturday", "8.00am - 5.00pm"));

        return doctors;
    }





}
