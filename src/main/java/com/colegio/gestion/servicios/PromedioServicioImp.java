package com.colegio.gestion.servicios;

import java.util.List;

public class PromedioServicioImp {

    // Metodo para calcular el promedio de una lista de valores (notas)
    public double calcularPromedio(List<Double> notas) {
        return notas.stream().mapToDouble(nota -> nota).average().orElse(0.0);
        }

    }
