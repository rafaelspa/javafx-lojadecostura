package com.example.lojacosturafx.servicos;

import com.example.lojacosturafx.dtos.UsuarioDTO;
import com.example.lojacosturafx.entidades.Usuario;
import com.example.lojacosturafx.repositorios.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public void create(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.fromDTO(usuarioDTO);
        usuarioRepository.save(usuario);
    }
}
