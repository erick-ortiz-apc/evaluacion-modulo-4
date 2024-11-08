package com.colegio.gestion.servicios;

import com.colegio.gestion.modelos.Alumno;
import com.colegio.gestion.modelos.Materia;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class AlumnoServicio {

    private Map<String, Alumno> listaAlumnos = new HashMap<>();

    public void crearAlumno(Alumno alumno) {
        // Verificamos si el alumno ya existe
        if (!listaAlumnos.containsKey(alumno.getRut())) {
            listaAlumnos.put(alumno.getRut(), alumno);
            System.out.println("Alumno creado exitosamente.");
        } else {
            System.out.println("El alumno con RUT " + alumno.getRut() + " ya existe.");
        }
    }

    public void agregarMateria(String rutAlumno, Materia materia) {
        // Buscamos al alumno por su RUT
        Alumno alumno = listaAlumnos.get(rutAlumno);
        if (alumno != null) {
            // Agregamos la materia al alumno
            alumno.getMaterias().add(materia);
            System.out.println("Materia '" + materia.getNumero() + "' agregada al alumno con RUT " + rutAlumno + ".");
        } else {
            System.out.println("Alumno con RUT " + rutAlumno + " no encontrado.");
        }
    }

    public List<Materia> materiasPorAlumno(String rutAlumno) {
        // Buscamos al alumno por su RUT
        Alumno alumno = listaAlumnos.get(rutAlumno);
        if (alumno != null) {
            // Retornamos la lista de materias del alumno
            return alumno.getMaterias();
        } else {
            System.out.println("Alumno con RUT " + rutAlumno + " no encontrado.");
            return null;
        }
    }

    public Map<String, Alumno> listarAlumnos() {
        // Retornamos el mapa completo de alumnos
        return listaAlumnos;
    }
}