package com.example.lojacosturafx.repositorios;

import com.example.lojacosturafx.entidades.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeloRepository extends JpaRepository<Modelo, Long> {
}
