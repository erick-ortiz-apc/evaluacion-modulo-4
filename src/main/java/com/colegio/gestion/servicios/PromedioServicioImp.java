package com.colegio.gestion.servicios;

import java.util.List;

public class PromedioServicioImp {

    // Metodo para calcular el promedio de una lista de valores (notas)
    public double calcularPromedio(List<Double> valores) {
        if (valores == null || valores.isEmpty()) {
            return 0;  // Si la lista está vacía o es nula, retornamos 0
        }

        double suma = 0;

        // Sumar todos los valores de la lista
        for (Double valor : valores) {
            suma += valor;
        }

        // Calcular el promedio
        return suma / valores.size();
    }
}
