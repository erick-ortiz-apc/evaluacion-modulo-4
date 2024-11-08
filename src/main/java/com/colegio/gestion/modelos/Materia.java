package com.colegio.gestion.modelos;

import java.util.List;
import java.util.ArrayList;

public class Materia {
<<<<<<< HEAD
    private MateriaEnum numero;
    private List<Double> notas;

    public Materia(MateriaEnum numero, List<Double> notas) {
        this.numero = numero;
        this.notas = notas;
    }

    public MateriaEnum getNumero() {
        return numero;
    }

    public void setNombre(MateriaEnum numero) {
        this.numero = numero;
=======
    private MateriaEnum nombre;  // Tipo de la materia utilizando el enum MateriaEnum
    private List<Double> notas = new ArrayList<>();  // Lista de notas de la materia del alumno

    public Materia(MateriaEnum nombre) {
        this.nombre = nombre;
>>>>>>> 5a9b9dc759c1eb3a32594cb48981f6f1cd6487de
    }

    // Getters y Setters
    public MateriaEnum getNombre() { return nombre; }
    public void setNombre(MateriaEnum nombre) { this.nombre = nombre; }

<<<<<<< HEAD
    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }
=======
    public List<Double> getNotas() { return notas; }
    public void setNotas(List<Double> notas) { this.notas = notas; }
>>>>>>> 5a9b9dc759c1eb3a32594cb48981f6f1cd6487de
}
