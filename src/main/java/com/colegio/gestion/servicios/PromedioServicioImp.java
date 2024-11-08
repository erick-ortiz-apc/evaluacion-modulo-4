package com.colegio.gestion.servicios;

import com.colegio.gestion.modelos.Materia;

import java.util.List;

public class PromedioServicioImp {

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
    }
}
