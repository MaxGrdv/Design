package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


public class Controller {
    private String loginInBD = "server";
    @FXML
    private TextField stateOfMistake;

    @FXML
    private Button button;
    @FXML
    private TextField login;

    @FXML
    public void initialize() {
        stateOfMistake.setVisible(false);
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> login.getText());
        if (login.getText().equals(loginInBD)) {
            stateOfMistake.setVisible(true);
            stateOfMistake.setText("It's login is exist! Try again");
        }
    }

}