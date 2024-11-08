package com.colegio.gestion.servicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import com.colegio.gestion.modelos.Alumno;

public class ArchivoServicio {

    // Constructor con dependencia de PromedioServicioImp
    public ArchivoServicio() {
        this.promediosServicioImp = promediosServicioImp;
    }

    // Método para exportar los datos de los alumnos
    public void exportarDatos(Map<String, Alumno> alumnos, String ruta) {
        File archivo = new File(ruta);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            writer.write("RUT, Nombre, Promedio\n");

            // Iterar sobre todos los alumnos en el mapa
            for (Map.Entry<String, Alumno> entry : alumnos.entrySet()) {
                Alumno alumno = entry.getValue();

                // Calcular el promedio del alumno
                double promedio = promediosServicioImp.calcularPromedio(alumno);

                // Escribir los datos del alumno y su promedio en el archivo
                writer.write(alumno.getRut() + ", " + alumno.getNombre() + ", " + promedio + "\n");
            }

            System.out.println("Archivo exportado exitosamente en: " + ruta);
        } catch (IOException e) {
            System.out.println("Error al exportar los datos: " + e.getMessage());
        }
    }
}
