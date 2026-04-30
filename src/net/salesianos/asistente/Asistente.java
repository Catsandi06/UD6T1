package net.salesianos.asistente;

public class Asistente {
    private String dni;
    private String nombre;
    private String grupo;

    public Asistente(String dni, String nombre, String grupo) {
        this.dni = dni;
        this.nombre = nombre;
        this.grupo = grupo;
    }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getGrupo() { return grupo; }
    public void setGrupo(String grupo) { this.grupo = grupo; }

    @Override
    public String toString() {
        return "Asistente [dni=" + dni + ", nombre=" + nombre + ", grupo=" + grupo + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Asistente asistente = (Asistente) obj;
        return java.util.Objects.equals(dni, asistente.dni);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(dni);
    }
}
