package net.salesianos;

import net.salesianos.reparacion.Reparacion;
import net.salesianos.asistente.Asistente;
import net.salesianos.videojuego.Videojuego;

import java.util.*;

import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("=== ACTIVIDAD 1: GESTION DE REPARACIONES ===\n");
        actividad1();

        System.out.println("\n=== ACTIVIDAD 2: GESTION DE ASISTENTES ===\n");
        actividad2();

        System.out.println("\n=== ACTIVIDAD 3: GESTION DE VIDEOJUEGOS ===\n");
        actividad3();
    }

    public static void actividad2() {
        HashSet<Asistente> asistentes = new HashSet<>();

        Asistente a1 = new Asistente("111A", "Elena", "DAM1");
        Asistente a2 = new Asistente("222B", "Hugo", "DAM1");
        Asistente a3 = new Asistente("333C", "Sara", "DAW1");
        Asistente a4 = new Asistente("111A", "Elena repetida", "DAM2");
        asistentes.add(a1);
        asistentes.add(a2);
        asistentes.add(a3);
        asistentes.add(a4);
        System.out.println("Anadidos 4 asistentes (uno repetido)");

        System.out.println("Contenido del conjunto:");
        for (Asistente a : asistentes) {
            System.out.println(a);
        }

        System.out.println("Total asistentes: " + asistentes.size());

        HashMap<String, Integer> conteo = new HashMap<>();
        System.out.println("HashMap de conteo creado");

        for (Asistente a : asistentes) {
            conteo.put(a.getGrupo(), conteo.getOrDefault(a.getGrupo(), 0) + 1);
        }

        System.out.println("Contenido del HashMap: " + conteo);

        System.out.println("Asistentes en DAM1: " + conteo.getOrDefault("DAM1", 0));

        System.out.println("¿Existe grupo ASIR1? " + conteo.containsKey("ASIR1"));

        conteo.remove("ASIR1");
        System.out.println("Eliminando ASIR1 si existe...");

        System.out.println("Claves del mapa: " + conteo.keySet());
    }

    public static void actividad3() {
        System.out.println("Actividad 3 iniciada");

        ArrayList<Videojuego> videojuegos = new ArrayList<>();
        System.out.println("ArrayList de videojuegos creado");

        try (BufferedReader br = new BufferedReader(new FileReader("videojuegos.csv"))) {
            String linea;
            System.out.println("Leyendo archivo CSV...");
            boolean primera = true;
            while ((linea = br.readLine()) != null) {
                if (primera) { primera = false; continue; }
                String[] datos = linea.split(",");
                videojuegos.add(new Videojuego(datos[0], datos[1], Integer.parseInt(datos[2])));
                System.out.println("Anadido: " + datos[0]);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
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
