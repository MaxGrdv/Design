package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

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
    public void initialize(ActionEvent event) throws IOException {
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> login.getText());
        if (login.getText().equals(loginInBD)) {
            stateOfMistake.setVisible(true);
            stateOfMistake.setText("It's login is exist! Try again");

        }

        Parent newParent = FXMLLoader.load(getClass().getResource("window2.fxml"));
        Scene newScene = new Scene(newParent);
        Stage newStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        newStage.setScene(newScene);
        newStage.show();


    }

}