package net.salesianos;

import net.salesianos.reparacion.Reparacion;

import java.util.*;

public class App {
    public static void main(String[] args) {
        actividad1();
    }

    public static void actividad1() {
        Queue<Reparacion> cola = new ArrayDeque<>();
        cola.add(new Reparacion("R001", "Ana", "Cambio de pantalla", false));
        cola.add(new Reparacion("R002", "Luis", "Bateria danada", true));
        System.out.println("Reparaciones anadidas a la cola");
    }
}
