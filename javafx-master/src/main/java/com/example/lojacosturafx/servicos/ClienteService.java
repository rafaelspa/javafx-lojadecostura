package com.example.lojacosturafx.servicos;

import com.example.lojacosturafx.entidades.Cliente;
import com.example.lojacosturafx.repositorios.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClienteService {
    private ClienteRepository clienteRepository;

    public Cliente create(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente findByEmail(String email) {
        return clienteRepository.findByEmail(email);
    }

    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }
}
