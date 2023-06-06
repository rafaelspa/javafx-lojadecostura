package com.example.lojacosturafx.controllers;

import com.example.lojacosturafx.entidades.Cliente;
import com.example.lojacosturafx.servicos.ClienteService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

// fonte: https://github.com/miduraa11/javafx-mysql-crud/blob/master/src/library/Books.java

@RequiredArgsConstructor
@Component
public class ClienteController implements Initializable {

    private final ClienteService clienteService;

    @FXML
    private TextField tfId;

    @FXML
    private TextField tfNome;

    @FXML
    private TextField tfTelefone;

    @FXML
    private TextField tfEmail;

    @FXML
    private Button insertButton;

    @FXML
    private Button updateButton;

    @FXML
    private Button deleteButton;

    @FXML
    private TableView<Cliente> TableView;

    @FXML
    private TableColumn<Cliente, Long> idColumn;

    @FXML
    private TableColumn<Cliente, String> nomeColumn;

    @FXML
    private TableColumn<Cliente, String> telefoneColumn;

    @FXML
    private TableColumn<Cliente, String> emailColumn;
    
    @FXML
    private void insertButton() {
        clienteService.create(new Cliente(tfNome.getText().toString(), tfTelefone.getText().toString(), tfEmail.getText().toString()));
        showCliente();
    }


    @FXML
    private void updateButton() {
//        Cliente cliente = clienteService.findByEmail(tfEmail.getText().toString());
        Optional<Cliente> cliente = clienteService.findById(Long.valueOf(tfId.getText().toString()));
        showCliente();
    }

    @FXML
    private void deleteButton() {
        clienteService.delete(Long.valueOf(tfId.getText().toString()));
        showCliente();
    }

    public ObservableList<Cliente> getClienteList(){
//        ObservableList<Cliente> ClienteList = FXCollections.observableArrayList();
        ObservableList<Cliente> ClienteList = FXCollections.emptyObservableList();
        List<Cliente> clientes = clienteService.findAll();
        if (!clientes.isEmpty()) {
            ClienteList.addAll(clientes);
        }
        return ClienteList;
    }

    // I had to change ArrayList to ObservableList I didn't find another option to do this but this works :)
    public void showCliente() {
        ObservableList<Cliente> list = getClienteList();

        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nomeColumn.setCellValueFactory(new PropertyValueFactory<>("nome"));
        telefoneColumn.setCellValueFactory(new PropertyValueFactory<>("telefone"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));

        TableView.setItems(list);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        showCliente();
    }
}
