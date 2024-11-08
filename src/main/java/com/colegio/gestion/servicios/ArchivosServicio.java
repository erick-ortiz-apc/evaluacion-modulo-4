package com.colegio.gestion.servicios;

import com.colegio.gestion.modelos.Alumno;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import com.colegio.gestion.modelos.Alumno;

public class ArchivosServicio {
    public void exportarDatos(Map<String, Alumno> alumnos, String ruta) {
        try (FileWriter writer = new FileWriter(ruta)) {
            for (Alumno alumno : alumnos.values()) {
                writer.write("Alumno: " + alumno.getRut() + " - " + alumno.getNombre() + "\n");
                alumno.getMaterias().forEach(materia -> {
                    try {
                        writer.write("Materia: " + materia.getNombre() + " - Promedio: " +
                                new PromedioServicioImp().calcularPromedio(materia.getNotas()) + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
            }
            System.out.println("Datos exportados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al exportar datos: " + e.getMessage());
        }
    }
}
