package com.example.parcial2.repositorios;

import com.example.parcial2.modelos.Sala;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ISalaRepositorio extends JpaRepository<Sala, Integer> {

    List<Sala> findByTipo(String tipo);

}
