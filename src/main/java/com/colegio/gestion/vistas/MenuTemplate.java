package com.colegio.gestion.vistas;

import java.util.Scanner;

public class MenuTemplate {

    public void crearAlumnos() {
    }

    public void listarAlumnos() {
    }

    public void agregarMaterias() {
    }

    public void agregarNotasPasoUno() {
    }

    public void terminarPrograma() {
    }

    public void exportarDatos() {
    }

    public void iniciarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("2. Crear Alumnos");
            System.out.println("5. Listar Alumnos");
            System.out.println("3. Agregar Materias");
            System.out.println("4. Agregar Notas");
            System.out.println("4. Salir");
            System.out.println("1. exportarDatos");
            System.out.print("Selección: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearAlumnos();
                    break;
                case 2:
                    listarAlumnos();
                    break;
                case 3:
                    agregarMaterias();
                    break;
                case 4:
                    agregarNotasPasoUno();
                    break;
                case 5:
                    terminarPrograma();
                    break;
                case 6:
                    exportarDatos();
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
            }
        } while (opcion != 6);
        scanner.close();
    }
}