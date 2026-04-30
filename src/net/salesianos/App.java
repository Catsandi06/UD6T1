package net.salesianos;

import net.salesianos.reparacion.Reparacion;
import net.salesianos.asistente.Asistente;

import java.util.*;

import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("=== ACTIVIDAD 1: GESTION DE REPARACIONES ===\n");
        actividad1();

        System.out.println("\n=== ACTIVIDAD 2: GESTION DE ASISTENTES ===\n");
        actividad2();
    }

    public static void actividad2() {
        HashSet<Asistente> asistentes = new HashSet<>();
        System.out.println("Conjunto de asistentes creado");
    }

    public static void actividad1() {
        Queue<Reparacion> cola = new ArrayDeque<>();
        cola.add(new Reparacion("R001", "Ana", "Cambio de pantalla", false));
        cola.add(new Reparacion("R002", "Luis", "Bateria danada", true));
        cola.add(new Reparacion("R003", "Marta", "Teclado roto", false));
        cola.add(new Reparacion("R004", "Pedro", "Puerto de carga", true));
        System.out.println("Reparaciones anadidas a la cola");

        System.out.println("\nListado de reparaciones:");
        for (Reparacion r : cola) {
            System.out.println(r);
        }

        System.out.println("\nPrimera reparacion (peek): " + cola.peek());

        Stack<Reparacion> historial = new Stack<>();
        historial.push(cola.poll());
        historial.push(cola.poll());
        System.out.println("Atendidas dos reparaciones, guardadas en pila");
        System.out.println("Ultima reparacion atendida: " + historial.peek());

        System.out.println("Extrayendo de la pila: " + historial.pop());
        System.out.println("Reparaciones pendientes restantes: " + cola.size());
        System.out.println("¿Cola vacia? " + cola.isEmpty());

        System.out.println("\n--- Informacion adicional ---");
        System.out.println("Total historial: " + historial.size());
        System.out.println("Elementos en historial: " + historial);
    }
}
