package com.colegio.gestion.modelos;

import java.util.List;
import java.util.ArrayList;

public class Materia {
    private MateriaEnum nombre;  // Tipo de la materia utilizando el enum MateriaEnum
    private List<Double> notas = new ArrayList<>();  // Lista de notas de la materia del alumno

    public Materia(MateriaEnum nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters
    public MateriaEnum getNombre() { return nombre; }
    public void setNombre(MateriaEnum nombre) { this.nombre = nombre; }

    public List<Double> getNotas() { return notas; }
    public void setNotas(List<Double> notas) { this.notas = notas; }
}
