package com.example.parcial2.modelos.mapas;

import com.example.parcial2.modelos.Cine;

import com.example.parcial2.modelos.dtos.AdministradorDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper(componentModel = "spring")
public interface IAdministradorMapa {

    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "detalle", target = "detalle")
    @Mapping(source = "salas", target = "salas")
    @Mapping(source = "direccion", target = "direccion")
    @Mapping(source = "ciudad", target = "ciudad")
    @Mapping(source = "capacidad", target = "capacidad")
    @Mapping(source = "tipo", target = "tipo")
    AdministradorDTO convertir_a_dto_administrador(Cine Cine);
    List<AdministradorDTO> convertir_lista_administrador_dto(List<Cine>lista);


}
