package com.aluracursos.desafio2.principal;

import com.aluracursos.desafio2.model.DatosCantante;
import com.aluracursos.desafio2.model.TipoCantante;
import com.aluracursos.desafio2.repository.DatosCantanteRepository;

import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private DatosCantanteRepository repositorio;

    public Principal(DatosCantanteRepository repository) {
        this.repositorio = repository;
    }

    public void muestraElMenu(){
        var opcion = -1;
        while (opcion != 0){
            var menu = """
                    1 - Registrar datos de cantantes
                    2 - Registrar datos de canciones
                    3 - Buscar canciones por cantantes
                    4 - Obtener información sobre un cantante
                    
                    0 - Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    registraCantantes();
                    break;
//                case 2:
//                    registraCanciones();
//                    break;
//                case 3:
//                    BuscarCancionesPorCantante();
//                    break;
//                case 4:
//                    obtenerInfoCantante();
//                    break;
                case 0:
                    System.out.println("Cerrando la aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    private void registraCantantes() {
            var nuevo = "S";

            while (nuevo.equalsIgnoreCase("s")){
                System.out.println("Nombre del cantante: ");
                var nombre = teclado.nextLine();
                System.out.println("Que tipo de artista es (solo, due, banda); ");
                var tipo = teclado.nextLine();
                TipoCantante tipoCantante = TipoCantante.valueOf(tipo.toUpperCase());
                DatosCantante cantante = new DatosCantante(nombre,tipoCantante);
                repositorio.save(cantante);
                System.out.println("Registrar un nuevo cantante? (S/N)");
                nuevo = teclado.nextLine();
            }
        }


}
