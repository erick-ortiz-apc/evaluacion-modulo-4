package com.colegio.gestion.servicios;

import com.colegio.gestion.modelos.Alumno;
import com.colegio.gestion.modelos.Materia;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class ArchivoServicio {

    // Atributos
    private List<Alumno> alumnosACargar = new ArrayList<>();
    private PromedioServicioImp promediosServicioImp = new PromedioServicioImp();

    /**
     * Método que exporta los datos de los alumnos y sus promedios a un archivo.
     *
     * @param alumnos Mapa de alumnos donde la clave es el rut y el valor es el objeto Alumno.
     * @param ruta La ruta del archivo donde se exportarán los datos.
     */
    public void exportarDatos(Map<String, Alumno> alumnos, String ruta) {
        // Agregar los alumnos al listado temporal para procesamiento
        alumnosACargar.addAll(alumnos.values());

        // Abrir el archivo de salida
        try (FileWriter writer = new FileWriter(ruta)) {
            // Escribir el encabezado del archivo
            writer.append("RUT, Nombre, Promedio\n");

            // Iterar sobre los alumnos y exportar sus datos
            for (Alumno alumno : alumnosACargar) {
                // Obtener las materias del alumno
                List<Materia> materias = alumno.getMaterias();

                // Calcular el promedio de las materias (se calcula a partir de los promedios de las materias)
                double promedio = promediosServicioImp.calcularPromedio(materias);

                // Escribir los datos del alumno en el archivo
                writer.append(alumno.getRut())
                        .append(", ")
                        .append(alumno.getNombre())
                        .append(", ")
                        .append(String.valueOf(promedio))
                        .append("\n");
            }
            System.out.println("Datos exportados exitosamente a " + ruta);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}

