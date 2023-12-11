package es.ieslosmontecillos.micontrol;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private MiControl acgControl;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void onMouseClicado(MouseEvent actionEvent) {
        welcomeText.setText("¡Has Clicado la zona roja!");
    }
}