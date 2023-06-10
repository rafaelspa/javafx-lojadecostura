package com.example.lojacosturafx.repositorios;

import com.example.lojacosturafx.entidades.Peca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PecaRepository extends JpaRepository<Peca, Long> {
}
