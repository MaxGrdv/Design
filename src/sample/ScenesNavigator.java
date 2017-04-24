package sample;

import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class ScenesNavigator {
    static final String MAIN = "sample.fxml";
    static final String WINDOW_2 = "window2.fxml";


    private static Controller controller;
    private static Logger logger = Logger.getAnonymousLogger();

    private ScenesNavigator() {

    }

    static void setController(Controller controller) {
        ScenesNavigator.controller = controller;
    }

    static void loadScene(String fxml) throws IOException {
        try {
            controller.setSceneHolder(FXMLLoader.load(ScenesNavigator.class.getResource(fxml)));
        } catch (Exception e) {
            logger.log(Level.ALL, "mistake", e);
        }
    }

}
