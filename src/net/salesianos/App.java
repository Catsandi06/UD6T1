package net.salesianos;

import net.salesianos.reparacion.Reparacion;

import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("=== ACTIVIDAD 1: GESTIÓN DE REPARACIONES ===\n");
        actividad1();
    }

    public static void actividad1() {
        Queue<Reparacion> cola = new ArrayDeque<>();
        cola.add(new Reparacion("R001", "Ana", "Cambio de pantalla", false));
        cola.add(new Reparacion("R002", "Luis", "Batería dañada", true));
        cola.add(new Reparacion("R003", "Marta", "Teclado roto", false));
        cola.add(new Reparacion("R004", "Pedro", "Puerto de carga", true));

        System.out.println("iii. Reparaciones pendientes:");
        for (Reparacion r : cola) System.out.println(r);

        System.out.println("\niv. Primera reparación: " + cola.peek());

        Stack<Reparacion> historial = new Stack<>();
        historial.push(cola.poll());
        historial.push(cola.poll());
        System.out.println("\nv. Atendidas dos reparaciones.");

        System.out.println("vi. Guardadas en pila historial.");

        System.out.println("vii. Última atendida: " + historial.peek());

        System.out.println("viii. Extraída del historial: " + historial.pop());

        System.out.println("ix. Pendientes restantes: " + cola.size());

        System.out.println("x. ¿Cola vacía? " + cola.isEmpty());
    }
}
