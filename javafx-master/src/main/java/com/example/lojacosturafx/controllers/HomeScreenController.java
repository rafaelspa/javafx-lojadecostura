package com.example.lojacosturafx.controllers;

import com.example.lojacosturafx.JavaFxApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.input.MouseEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class HomeScreenController {

    private final JavaFxApplication javaFxApplication;

    @FXML
    private Button AddonButton;

    @FXML
    private Button accountButton;

    @FXML
    private Button budgetButton;

    @FXML
    private Button clientButton;

    @FXML
    private Button fabricButton;

    @FXML
    private Hyperlink logoutLink;

    @FXML
    private Button modelsButton;

    @FXML
    private Button orderButton;

    @FXML
    private Button piecesButton;

    @FXML
    void AddonAction(ActionEvent event) {
        javaFxApplication.publicarContextoPagina("adicionais");
    }

    @FXML
    void accountAction(ActionEvent event) {

    }

    @FXML
    void budgetAction(ActionEvent event) {

    }

    @FXML
    void clientAction(MouseEvent event) {
        javaFxApplication.publicarContextoPagina("clientes");
    }

    @FXML
    void fabricAction(ActionEvent event) {

    }

    @FXML
    void logoutAction(ActionEvent event) {

    }

    @FXML
    void modelsAction(ActionEvent event) {
        javaFxApplication.publicarContextoPagina("modelos");
    }

    @FXML
    void orderAction(ActionEvent event) {

    }

    @FXML
    void piecesAction(ActionEvent event) {
        javaFxApplication.publicarContextoPagina("pecas");
    }

}