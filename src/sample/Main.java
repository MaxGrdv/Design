package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application {
    private Stage stage;
    private Scene scene;
    private AnchorPane pane;


    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;

        pane = (AnchorPane) FXMLLoader.load(Main.class.getResource("sample.fxml"));
        scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
