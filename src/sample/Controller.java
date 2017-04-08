package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;


public class Controller {
    private String loginInBD = "server";

    @FXML
    private TextField stateOfMistake;

    @FXML
    private Button button;
    @FXML
    private TextField login;

    @FXML
    public void initialize() throws IOException {
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> login.getText());
        if (login.getText().equals(loginInBD)) {
            stateOfMistake.setVisible(true);
            stateOfMistake.setText("It's login is exist! Try again");

        }
    }

}