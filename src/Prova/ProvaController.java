package Prova;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ProvaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnpress;

    @FXML
    void doPress(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnpress != null : "fx:id=\"btnpress\" was not injected: check your FXML file 'Prova.fxml'.";

    }
}