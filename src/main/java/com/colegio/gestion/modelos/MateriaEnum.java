package com.colegio.gestion.modelos;

public enum MateriaEnum {
    MATEMATICAS(1, "MATEMATICAS"),
    LENGUAJE(2, "LENGUAJE"),
    CIENCIA(3, "CIENCIA"),
    HISTORIA(4, "HISTORIA");

    private final int numero;
    private final String descripcion;  // Corregido de 'int' a 'String'

    // Constructor que recibe tanto el número como la descripción
    MateriaEnum(int numero, String descripcion) {
        this.numero = numero;
        this.descripcion = descripcion;
    }

    // Getter para obtener el número
    public int getNumero() {
        return numero;
    }

    // Getter para obtener la descripción de la materia
    public String getDescripcion() {
        return descripcion;
    }

    public String getMateriaConNumero() {
        return numero + ". " + descripcion;
    }
}