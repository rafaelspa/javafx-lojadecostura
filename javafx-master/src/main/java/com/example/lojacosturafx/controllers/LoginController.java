package com.example.lojacosturafx.controllers;

import javafx.application.HostServices;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class LoginController {

    private final HostServices hostServices;

    @FXML
    private Label btnEsqueciASenha;

    @FXML
    private Button btnLogar;

    @FXML
    private Button btnCadastro;

    @FXML
    private Label lblErrors;

    @FXML
    private PasswordField tfSenha;

    @FXML
    private TextField tfEmail;

    @FXML
    void handleButtonAction(MouseEvent event) {

    }
//    @FXML
//    public void initialize() {
//        this.button.setOnAction(actionEvent ->
//                this.label.setText(this.hostServices.getDocumentBase())
//        );
//    }
}
