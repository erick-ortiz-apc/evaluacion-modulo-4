package com.colegio.gestion.servicios;

import com.colegio.gestion.modelos.Materia;

import java.util.List;

public class PromedioServicioImp {

<<<<<<< HEAD
    public double calcularPromedio(List<Materia> materias) {
        if (materias == null || materias.isEmpty()) {
            throw new IllegalArgumentException("La lista de materias no puede estar vacía");
        }

        double sumaPromedios = 0;
        int cantidadMaterias = 0;

        // Iterar sobre las materias y sumar sus promedios
        for (Materia materia : materias) {
            sumaPromedios += materia.calcularPromedio();
            cantidadMaterias++;
        }

        // Calcular el promedio total
        return sumaPromedios / cantidadMaterias;
=======
    // Metodo para calcular el promedio de una lista de valores (notas)
    public double calcularPromedio(List<Double> notas) {
        return notas.stream().mapToDouble(nota -> nota).average().orElse(0.0);
        }

>>>>>>> 5a9b9dc759c1eb3a32594cb48981f6f1cd6487de
    }
