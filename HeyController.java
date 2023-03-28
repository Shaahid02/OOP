package com.example.assign;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class HeyController implements Initializable {

    @FXML
    private ListView listView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listView.getItems().addAll("XRay", "PET Scan", "CAT Scan", "ECG", "MRI Scan");
    }
}
