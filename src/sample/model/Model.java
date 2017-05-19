package sample.model;


import javafx.beans.Observable;
import javafx.beans.property.SimpleStringProperty;

public class Model {
    private SimpleStringProperty name;

    public Model(String name) {
        this.name = new SimpleStringProperty(name);
    }

    @Override
    public String toString() {
        return name.getValue();
    }

    public String getName() {

        return name.getValue();
    }

    public void setName(String name) {
        this.name.setValue(name);
    }

    public Observable getProperty() {
        return name;
    }
}
