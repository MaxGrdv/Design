package sample;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import sample.model.Model;

import java.io.IOException;


public class Controller {
    @FXML
    ListView listView;
    ObservableList<Model> items = FXCollections.observableArrayList(param -> new Observable[]{param.getProperty()});
    private String loginInBD = "server";
    @FXML
    private TextField stateOfMistake;
    @FXML
    private Button oK;
    @FXML
    private Button button;
    @FXML
    private TextField login;
    @FXML
    private Button add;
    private Model dialogs = new Model("ac");

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


    @FXML
    public void changing() {
        items.addAll(dialogs, new Model("group"));
        listView.setItems(items);
        if (dialogs.getName().contentEquals("ac")) {
            dialogs.setName("AC");
        } else dialogs.setName("Ivt");
    }
}