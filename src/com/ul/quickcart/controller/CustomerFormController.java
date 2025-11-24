package com.ul.quickcart.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class CustomerFormController {
    public AnchorPane container;

    private void setUi(String location) {
        URL resource = getClass().getResource("/com/ul/quickcart/view/" + location + ".fxml");
        Parent parent = null;
        try {
            parent = FXMLLoader.load(resource);
            Scene scene = new Scene(parent);
            Stage stage = (Stage) container.getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle(location);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void backOnAction(MouseEvent mouseEvent) {
        setUi("DashboardForm");
    }
}
