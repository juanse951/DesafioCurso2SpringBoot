package com.aluracursos.desafio2.model;

import java.util.ArrayList;
import java.util.List;

public class DatosCantante {

    private String nombre;
    private TipoCantante tipo;
    private List<DatosCancion> canciones = new ArrayList<>();

    public DatosCantante(String nombre, TipoCantante tipo){
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoCantante getTipo() {
        return tipo;
    }

    public void setTipo(TipoCantante tipo) {
        this.tipo = tipo;
    }

    public List<DatosCancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<DatosCancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", canciones=" + canciones;
    }
}
