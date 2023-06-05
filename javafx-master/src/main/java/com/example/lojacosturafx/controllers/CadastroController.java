package com.example.lojacosturafx.controllers;

import com.example.lojacosturafx.JavaFxApplication;
import com.example.lojacosturafx.dtos.UsuarioDTO;
import com.example.lojacosturafx.repositorios.UsuarioRepository;
import com.example.lojacosturafx.servicos.UsuarioService;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

@RequiredArgsConstructor
@Component
public class CadastroController implements Initializable {
    public final JavaFxApplication javaFxApplication;
    public final UsuarioService usuarioService;

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextField tfEmail;

    @FXML
    private TextField tfNomeCompleto;

    @FXML
    private TextField tfSenha;

    @FXML
    void onCliqueSalva(MouseEvent event) throws IOException {
        if (tfEmail.getText().isEmpty() || tfNomeCompleto.getText().isEmpty() || tfSenha.getText().isEmpty()) {
//            lblStatus.setTextFill(Color.TOMATO);
//            lblStatus.setText("Enter all details");
            System.out.println("n foi");
        } else {
            System.out.println("foi");
            saveData();
        }
    }

    @FXML
    void onCliqueVolta(MouseEvent event) throws IOException {
        javaFxApplication.mudarPagina("login");
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

    private void saveData() throws IOException {
        UsuarioDTO usuarioDTO = new UsuarioDTO(tfNomeCompleto.getText(), tfEmail.getText(), tfSenha.getText());
        usuarioService.create(usuarioDTO);
//        lblStatus.setTextFill(Color.GREEN);
//        lblStatus.setText("Added Successfully");
        javaFxApplication.mudarPagina("login");
    }
}
