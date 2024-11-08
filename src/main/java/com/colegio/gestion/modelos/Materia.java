package com.colegio.gestion.modelos;

import java.util.List;

public class Materia {
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
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }
}
