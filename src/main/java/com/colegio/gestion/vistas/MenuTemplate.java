package com.colegio.gestion.vistas;

import java.util.Scanner;

public abstract class MenuTemplate {
    protected Scanner scanner = new Scanner(System.in);

    public void iniciarMenu() {
        while (true) {
            System.out.println("1. Crear Alumno");
            System.out.println("2. Listar Alumnos");
            System.out.println("3. Agregar Materia");
            System.out.println("4. Agregar Nota");
            System.out.println("5. Exportar Datos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> crearAlumno();
                case 2 -> listarAlumnos();
                case 3 -> agregarMateria();
                case 4 -> agregarNotaPasoUno();
                case 5 -> exportarDatos();
                case 6 -> terminarPrograma();
                default -> System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }

    // Métodos abstractos
    public abstract void crearAlumno();
    public abstract void listarAlumnos();
    public abstract void agregarMateria();
    public abstract void agregarNotaPasoUno();
    public abstract void exportarDatos();
    public abstract void terminarPrograma();
}