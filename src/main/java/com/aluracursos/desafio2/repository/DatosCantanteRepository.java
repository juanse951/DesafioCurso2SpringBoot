package com.aluracursos.desafio2.repository;

import com.aluracursos.desafio2.model.DatosCantante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DatosCantanteRepository extends JpaRepository <DatosCantante, Long>{
    Optional<DatosCantante> findByNombreContainingIgnoreCase(String nombre);
}
