package com.colegio.gestion.vistas;

import com.colegio.gestion.modelos.Alumno;
import com.colegio.gestion.modelos.Materia;
import com.colegio.gestion.servicios.AlumnoServicio;
import com.colegio.gestion.servicios.ArchivoServicio;

import java.util.Scanner;

public class Menu extends MenuTemplate {

    // Instancias de los servicios
    private AlumnoServicio alumnoServicio = new AlumnoServicio();
    private ArchivoServicio archivoServicio = new ArchivoServicio();

    @Override
    public void crearAlumnos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el RUT del alumno:");
        String rut = scanner.nextLine();

        System.out.println("Ingrese el nombre del alumno:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido del alumno:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese la dirección del alumno:");
        String direccion = scanner.nextLine();

        Alumno nuevoAlumno = new Alumno(rut, nombre, apellido, direccion);
        alumnoServicio.crearAlumno(nuevoAlumno);

        System.out.println("Alumno creado exitosamente.");
    }

    @Override
    public void listarAlumnos() {
        System.out.println("--- Lista de Alumnos ---");
        for (Alumno alumno : alumnoServicio.listarAlumnos().values()) {
            System.out.println("RUT: " + alumno.getRut() + " - Nombre: " + alumno.getNombre());
        }
    }

    @Override
    public void agregarMaterias() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el RUT del alumno para asignar una materia:");
        String rutAlumno = scanner.nextLine();

        System.out.println("Seleccione una materia:");
        System.out.println("1. Matemáticas");
        System.out.println("2. Lenguaje");
        System.out.println("3. Ciencia");
        System.out.println("4. Historia");

        int opcionMateria = scanner.nextInt();
        Materia materiaSeleccionada = null;

        switch (opcionMateria) {
            case 1:
                materiaSeleccionada = new Materia(1, new ArrayList<>());
                break;
            case 2:
                materiaSeleccionada = new Materia(2, new ArrayList<>());
                break;
            case 3:
                materiaSeleccionada = new Materia(3, new ArrayList<>());
                break;
            case 4:
                materiaSeleccionada = new Materia(4, new ArrayList<>());
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }

        alumnoServicio.agregarMateria(rutAlumno, materiaSeleccionada);
        System.out.println("Materia '" + materiaSeleccionada.getNumero() + "' asignada al alumno con RUT " + rutAlumno + ".");
    }

    @Override
    public void agregarNotasPasoUno() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el RUT del alumno para agregar una nota:");
        String rutAlumno = scanner.nextLine();

        System.out.println("Ingrese la materia para la que se desea agregar la nota:");
        String materia = scanner.nextLine();

        System.out.println("Ingrese la nota:");
        double nota = scanner.nextDouble();

        //alumnoServicio.agregarNota(rutAlumno, materia, nota);
        System.out.println("Nota agregada exitosamente.");
    }

    @Override
    public void terminarPrograma() {
        System.out.println("Finalizando el sistema...");
        System.exit(0);
    }

    @Override
    public void exportarDatos() {
        archivoServicio.exportarPromedios();
        System.out.println("Datos exportados exitosamente.");
    }
}


