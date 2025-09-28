package com.example.parcial2.Servicios;

import com.example.parcial2.modelos.Cine;
import com.example.parcial2.repositorios.ICineRepositorio;
import org.springframework.stereotype.Service;

@Service
public class ServicioCine {

    private final ICineRepositorio cineRepositorio;


    public ServicioCine(ICineRepositorio cineRepositorio) {
        this.cineRepositorio = cineRepositorio;
    }

    public Cine guardar(Cine cine) {
        return cineRepositorio.save(cine);
    }

}
