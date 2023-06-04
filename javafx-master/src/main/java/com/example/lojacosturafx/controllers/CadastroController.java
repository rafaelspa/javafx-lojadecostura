package com.example.lojacosturafx.controllers;

import com.example.lojacosturafx.repositorios.UsuarioRepository;
import com.example.lojacosturafx.dtos.UsuarioDTO;
import javafx.application.HostServices;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@RequiredArgsConstructor
@Component
public class CadastroController implements Initializable {

    private final HostServices hostServices;

    @FXML
    private Button btnSave;

    @FXML
    private Label lblStatus;

    @FXML
    private TextField tfEmail;

    @FXML
    private TextField tfNomeCompleto;

    @FXML
    private TextField tfSenha;

    @FXML
    void HandleEvents(MouseEvent event) {
        if (tfEmail.getText().isEmpty() || tfNomeCompleto.getText().isEmpty() || tfSenha.getText().isEmpty()) {
            lblStatus.setTextFill(Color.TOMATO);
            lblStatus.setText("Enter all details");
        } else {
            saveData();
        }
    }

    private ObservableList<ObservableList> data;
    private UsuarioRepository usuarioRepository;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    private void clearFields() {
        tfNomeCompleto.clear();
        tfSenha.clear();
        tfEmail.clear();
    }

    private void saveData() {
        UsuarioDTO usuarioDTO = new UsuarioDTO(tfNomeCompleto.getText(), tfSenha.getText(), tfEmail.getText());
        lblStatus.setTextFill(Color.GREEN);
        lblStatus.setText("Added Successfully");
        clearFields();
    }
}
