package com.colegio.gestion.vistas;

import java.util.Scanner;
import java.util.HashMap;
import com.colegio.gestion.servicios.AlumnoServicio;
import com.colegio.gestion.modelos.Materia;
import com.colegio.gestion.servicios.ArchivosServicio;
import com.colegio.gestion.modelos.Alumno;
import com.colegio.gestion.modelos.MateriaEnum;

public class Menu extends MenuTemplate {
    private AlumnoServicio alumnoServicio = new AlumnoServicio();
    private ArchivosServicio archivoServicio = new ArchivosServicio();

    @Override
    public void crearAlumno() {
        System.out.print("Ingresa RUT: ");
        String rut = scanner.next();
        System.out.print("Ingresa nombre: ");
        String nombre = scanner.next();
        System.out.print("Ingresa apellido: ");
        String apellido = scanner.next();
        System.out.print("Ingresa dirección: ");
        String direccion = scanner.next();
        alumnoServicio.crearAlumno(new Alumno(rut, nombre, apellido, direccion));
        System.out.println("¡Alumno agregado!");
    }

    @Override
    public void listarAlumnos() {
        alumnoServicio.listarAlumnos().forEach((rut, alumno) -> {
            System.out.println("RUT: " + rut + ", Nombre: " + alumno.getNombre());
            alumno.getMaterias().forEach(materia -> {
                System.out.println("  Materia: " + materia.getNombre());
                System.out.println("  Notas: " + materia.getNotas());
            });
        });
    }

    @Override
    public void agregarMateria() {
        System.out.print("Ingresa RUT del Alumno: ");
        String rut = scanner.next();
        System.out.println("Selecciona una Materia: 1. MATEMATICAS, 2. LENGUAJE, 3. CIENCIA, 4. HISTORIA");
        int opcion = scanner.nextInt();
        MateriaEnum materiaEnum = MateriaEnum.values()[opcion - 1];
        alumnoServicio.agregarMateria(rut, new Materia(materiaEnum));
        System.out.println("¡Materia agregada!");
    }

    @Override
    public void agregarNotaPasoUno() {
        // Implementación de agregarNota
    }

    @Override
    public void exportarDatos() {
        System.out.print("Ingresa la ruta de exportación: ");
        String ruta = scanner.next();
        archivoServicio.exportarDatos(alumnoServicio.listarAlumnos(), ruta);
    }

    @Override
    public void terminarPrograma() {
        System.out.println("Programa finalizado.");
        System.exit(0);
    }
}
