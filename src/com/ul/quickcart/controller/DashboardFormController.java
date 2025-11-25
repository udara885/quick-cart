package com.ul.quickcart.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class DashboardFormController {
    public AnchorPane container;

    public void openCustomerFormOnAction(MouseEvent mouseEvent) {
        setUi("CustomerForm");
    }

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

    public void openProductFormOnAction(MouseEvent mouseEvent) {
        setUi("ProductForm");
    }

    public void openStatisticsFormOnAction(MouseEvent mouseEvent) {
        setUi("StatisticsForm");
    }

    public void openUserFormOnAction(MouseEvent mouseEvent) {
        setUi("UserForm");
    }

    public void openMakeOrderFormOnAction(MouseEvent mouseEvent) {
        setUi("MakeOrderForm");
    }

    public void openActivityFormOnAction(MouseEvent mouseEvent) {
        setUi("ActivityForm");
    }

    public void openSettingsFormOnAction(MouseEvent mouseEvent) {
        setUi("SettingsForm");
    }

    public void openPaymentsFormOnAction(MouseEvent mouseEvent) {
        setUi("PaymentsForm");
    }
}
