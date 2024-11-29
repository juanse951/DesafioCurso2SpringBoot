package com.aluracursos.desafio2.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cantantes")
public class DatosCantante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(unique = true)
    private String nombre;
    @Enumerated(EnumType.STRING)
    private TipoCantante tipo;
    @OneToMany(mappedBy = "cantante", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<DatosCancion> canciones = new ArrayList<>();

    public DatosCantante(){}

    public DatosCantante(String nombre, TipoCantante tipo){
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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
