package com.aluracursos.desafio2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "canciones")
public class DatosCancion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String titulo;
    @ManyToOne
    private DatosCantante cantante;

    public DatosCancion(){}
    public DatosCancion(String nombreCancion){
        this.titulo = nombreCancion;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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
