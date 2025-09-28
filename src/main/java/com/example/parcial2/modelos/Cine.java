package com.example.parcial2.modelos;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name = "cines")
public class Cine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String nit;
    private String detalle;
    private String salas;

    //FALTAN LAS RELACIONES ENTRE TABLAS

    @OneToMany
    @JoinColumn(name = "fk_sala", referencedColumnName = "id")
    @JsonManagedReference(value = "relacioncinesala")
    private List<Sala> sala;


    @OneToMany
    @JoinColumn(name = "fk_detallecine", referencedColumnName = "id")
    @JsonManagedReference(value = "relacioncinedetallecine")
    private List<DetalleCine> DetalleCine;


    public Cine() {
    }

    public Cine(Integer id, String nombre, String nit, String detalle, String salas) {
        this.id = id;
        this.nombre = nombre;
        this.nit = nit;
        this.detalle = detalle;
        this.salas = salas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getSalas() {
        return salas;
    }

    public void setSalas(String salas) {
        this.salas = salas;
    }
}