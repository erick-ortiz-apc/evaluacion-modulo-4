package com.colegio.gestion.utilidades;

import java.util.Scanner;  // Asegúrate de agregar esta línea

public class Utilidad {

    // Método para limpiar la pantalla (simula la limpieza de pantalla en consola)
    public static void limpiarPantalla() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("No se pudo limpiar la pantalla.");
        }
    }

    // Método para mostrar un mensaje con pausa
    public static void mostrarMensajeConPausa(String mensaje) {
        System.out.println(mensaje);
        System.out.println("Presione Enter para continuar...");
        try {
            System.in.read();
        } catch (Exception e) {
            System.out.println("Error al pausar.");
        }
    }

    // Método para mostrar mensajes de error
    public static void mostrarError(String mensajeError) {
        System.err.println("ERROR: " + mensajeError);
    }

    // Método para validar entrada numérica (ej. ID de alumno)
    public static int solicitarEntero(String mensaje) {
        Scanner scanner = new Scanner(System.in);  // Ahora la clase Scanner está disponible
        int numero;
        while (true) {
            System.out.print(mensaje);
            try {
                numero = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                mostrarError("Por favor, ingrese un número válido.");
            }
        }
        return numero;
    }
}
