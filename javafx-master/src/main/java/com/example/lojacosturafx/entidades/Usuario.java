package com.example.lojacosturafx.entidades;

import com.example.lojacosturafx.dtos.UsuarioDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeUsuario;
    private String emailUsuario;
    private String senhaUsuario;

    public void fromDTO(UsuarioDTO usuarioDTO) {
        id = usuarioDTO.getId();
        nomeUsuario = usuarioDTO.getNomeUsuario();
        emailUsuario = usuarioDTO.getEmailUsuario();
        senhaUsuario = usuarioDTO.getSenhaUsuario();
    }
}