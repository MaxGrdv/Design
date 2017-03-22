package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {
    private Stage stage;
    private Scene scene;
    private AnchorPane pane;
    private Label label;


    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        try {
            pane = (AnchorPane)FXMLLoader.load(Main.class.getResource("sample.fxml"));
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        scene = new Scene(pane, 600, 300);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
