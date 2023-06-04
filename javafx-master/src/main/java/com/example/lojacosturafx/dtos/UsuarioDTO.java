package com.example.lojacosturafx.dtos;

import com.example.lojacosturafx.entidades.Usuario;
import lombok.Data;

@Data
public class UsuarioDTO {
    private Long id;
    private String nomeUsuario;
    private String emailUsuario;
    private String senhaUsuario;

    public UsuarioDTO(String nomeUsuario, String emailUsuario, String senhaUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
        this.senhaUsuario = senhaUsuario;
    }

    public void fromUsuario(Usuario usuario) {
        id = usuario.getId();
        nomeUsuario = usuario.getNomeUsuario();
        senhaUsuario = usuario.getSenhaUsuario();
        emailUsuario = usuario.getEmailUsuario();
    }
}
