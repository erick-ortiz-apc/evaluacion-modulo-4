package com.colegio.gestion.vistas;

import java.util.Scanner;
import java.util.HashMap;
import com.colegio.gestion.servicios.AlumnoServicio;
import com.colegio.gestion.servicios.ArchivoServicio;
import com.colegio.gestion.servicios.PromedioServicioImp;
import com.colegio.gestion.modelos.Alumno;

public class Menu extends MenuTemplate {

    private AlumnoServicio alumnoServicio = new AlumnoServicio();
    private ArchivoServicio archivoServicio = new ArchivoServicio();

    // Usar un solo Scanner para evitar fugas de recursos
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void crearAlumnos() {
        System.out.println("Ingrese el nombre del alumno:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el rut del alumno:");
        String rut = scanner.nextLine();
        scanner.nextLine(); // Limpiar el buffer

        // Asegúrate de que el constructor de Alumno acepte estos parámetros
        Alumno nuevoAlumno = new Alumno(String.valueOf(rut), nombre, "", ""); // Ajusta según el constructor de Alumno
        alumnoServicio.agregarAlumno(nuevoAlumno);

        System.out.println("Alumno creado exitosamente.");
    }

    @Override
    public void listarAlumnos() {
        alumnoServicio.listarAlumnos();
    }

    @Override
    public void agregarMaterias() {
        System.out.println("Ingrese el rut del alumno para agregar una materia:");
        String rut = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Selecciona una materia:");
        int materia = scanner.nextInt();

        alumnoServicio.agregarMateria(rut, materia);
        System.out.println("Materia agregada exitosamente.");
    }

    @Override
    public void agregarNotasPasoUno() {
        System.out.println("Ingrese el rut del alumno para agregar una nota:");
        String alumnoId = scanner.nextLine();

        System.out.println("Ingrese el nombre de la materia:");
        String materia = scanner.next();

        System.out.println("Ingrese la nota:");
        double nota = scanner.nextDouble();

        alumnoServicio.agregarNota(alumnoId, materia, nota);
        System.out.println("Nota agregada exitosamente.");
    }

    @Override
    public void terminarPrograma() {
        System.out.println("Finalizando el sistema...");
        System.exit(0);
    }

    @Override
    public void exportarDatos() {
        // Asegúrate de pasar los parámetros correctos, por ejemplo, un Map de alumnos y la ruta
        HashMap<String, Alumno> alumnos = new HashMap<>(); // Suponiendo que tienes un Map de alumnos
        String ruta = "ruta/del/archivo.csv"; // Suponiendo que también necesitas una ruta de archivo
        archivoServicio.exportarDatos(alumnos, ruta); // Ajusta el método para recibir estos parámetros
        System.out.println("Datos exportados exitosamente.");
    }
}

