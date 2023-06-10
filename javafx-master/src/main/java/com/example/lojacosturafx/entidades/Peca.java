package com.example.lojacosturafx.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pecas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Peca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double precoBase;

    @OneToMany(fetch = FetchType.EAGER)
    List<Medida> medidas = new ArrayList<>();

    public Peca(String nome, Double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }
}
