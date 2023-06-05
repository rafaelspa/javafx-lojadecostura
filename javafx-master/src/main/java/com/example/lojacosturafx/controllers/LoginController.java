package com.example.lojacosturafx.controllers;

import com.example.lojacosturafx.JavaFxApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.IOException;

@RequiredArgsConstructor
@Component
public class LoginController {
    public final JavaFxApplication javaFxApplication;

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
    void onCliqueCadastro(MouseEvent event) throws IOException {
        javaFxApplication.mudarPagina("cadastro");
    }

    @FXML
    void onCliqueEsqueciASenha(MouseEvent event) {

    }

    @FXML
    void onCliqueLogar(MouseEvent event) {

    }
}
