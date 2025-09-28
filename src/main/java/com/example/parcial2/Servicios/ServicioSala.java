package com.example.parcial2.Servicios;

import com.example.parcial2.modelos.Sala;
import com.example.parcial2.repositorios.ISalaRepositorio;
import org.springframework.stereotype.Service;

@Service
public class ServicioSala {

    private final ISalaRepositorio salaRepositorio;


    public ServicioSala(ISalaRepositorio salaRepositorio) {
        this.salaRepositorio = salaRepositorio;
    }

    public Sala guardar(Sala sala) {
        return salaRepositorio.save(sala);
    }

}

