package com.aluracursos.desafio2.model;

public class DatosCancion {

    private String titulo;
    private DatosCantante cantante;

    public DatosCancion(String nombreCancion){
        this.titulo = nombreCancion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public DatosCantante getCantante() {
        return cantante;
    }

    public void setCantante(DatosCantante cantante) {
        this.cantante = cantante;
    }

    @Override
    public String toString() {
        return
                "titulo='" + titulo + '\'' +
                ", cantante=" + cantante.getNombre();
    }
}
