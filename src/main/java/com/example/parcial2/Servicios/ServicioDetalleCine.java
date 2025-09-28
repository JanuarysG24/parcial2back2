package com.example.parcial2.Servicios;

import com.example.parcial2.modelos.DetalleCine;
import com.example.parcial2.repositorios.IDetalleCineRepositorio;
import org.springframework.stereotype.Service;

@Service
public class ServicioDetalleCine {

    private final IDetalleCineRepositorio detalleCineRepositorio;


    public ServicioDetalleCine(IDetalleCineRepositorio detalleCineRepositorio) {
        this.detalleCineRepositorio = detalleCineRepositorio;
    }

    public DetalleCine guardar(DetalleCine detalleCine) {
        return detalleCineRepositorio.save(detalleCine);
    }
}
