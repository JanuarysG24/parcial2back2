package com.example.parcial2.modelos.dtos;

public class AdministradorDTO {

    private String nombre;
    private String detalle;
    private String salas;
    private Integer direccion;
    private String ciudad;
    private Integer capacidad;
    private String tipo;

    public AdministradorDTO() {
    }

    public AdministradorDTO(String nombre, String detalle, String salas, Integer direccion, String ciudad, Integer capacidad, String tipo) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.salas = salas;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Integer getDireccion() {
        return direccion;
    }

    public void setDireccion(Integer direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
