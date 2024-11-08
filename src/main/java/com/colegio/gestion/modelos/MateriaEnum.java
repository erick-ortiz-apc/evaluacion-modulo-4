package com.colegio.gestion.modelos;

public enum MateriaEnum {
    MATEMATICAS(1),
    LENGUAJE(2),
    CIENCIA(3),
    HISTORIA(4);

    private final int numero;

    // Constructor que recibe tanto el número como la descripción
    MateriaEnum(int numero) {
        this.numero = numero;
    }

    // Getter para obtener el número
    public int getNumero() {
        return numero;
    }

    public String getMateriaConNumero() {
        return numero + ". " + name();
    }
}

