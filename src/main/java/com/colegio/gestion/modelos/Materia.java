package com.colegio.gestion.modelos;

import java.util.List;

public class Materia {
    private MateriaEnum nombre;  // Tipo de la materia utilizando el enum MateriaEnum
    private List<Double> notas;  // Lista de notas de la materia del alumno

    public Materia(MateriaEnum nombre, List<Double> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public MateriaEnum getNombre() {
        return nombre;
    }

    public void setNombre(MateriaEnum nombre) {
        this.nombre = nombre;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public void agregarNota(Double nota) {
        this.notas.add(nota);
    }

    public double calcularPromedio() {
        double suma = 0;
        for (Double nota : notas) {
            suma += nota;
        }
        return notas.isEmpty() ? 0 : suma / notas.size();
    }
}
