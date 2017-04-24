package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class SceneController2 {

    /**
     * Event handler fired when the user requests a new vista.
     *
     * @param event the event that triggered the handler.
     */
    @FXML
    void nextPane(ActionEvent event) throws IOException {
        ScenesNavigator.loadScene(ScenesNavigator.WINDOW_2);
    }

}