package sample;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;


public class Controller {
    private String loginInBD = "server";
    @FXML
    private StackPane sceneHolder;
    @FXML
    private TextField stateOfMistake;
    @FXML
    private AnchorPane content;
    @FXML
    private Button button;
    @FXML
    private TextField login;


    void setSceneHolder(Node node) {
        sceneHolder.getChildren().setAll(node);
    }

    @FXML
    public void initialize() throws IOException {
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> login.getText());
        if (login.getText().equals(loginInBD)) {
            stateOfMistake.setVisible(true);
            stateOfMistake.setText("It's login is exist! Try again");
        }
        ScenesNavigator.loadScene(ScenesNavigator.WINDOW_2);
    }
}