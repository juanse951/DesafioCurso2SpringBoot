package com.aluracursos.desafio2.repository;

import com.aluracursos.desafio2.model.DatosCancion;
import com.aluracursos.desafio2.model.DatosCantante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface DatosCantanteRepository extends JpaRepository <DatosCantante, Long>{
    Optional<DatosCantante> findByNombreContainingIgnoreCase(String nombre);

    @Query("SELECT c FROM DatosCantante e JOIN e.canciones c WHERE e.nombre ILIKE %:nombre%")
    List<DatosCancion> BuscarCancionesPorCantante(String nombre);
}
