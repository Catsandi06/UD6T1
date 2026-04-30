package net.salesianos.videojuego;

public class Videojuego {
    private String titulo;
    private String genero;
    private int horasJugadas;

    public Videojuego(String titulo, String genero, int horasJugadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.horasJugadas = horasJugadas;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
    public int getHorasJugadas() { return horasJugadas; }
    public void setHorasJugadas(int horasJugadas) { this.horasJugadas = horasJugadas; }

    @Override
    public String toString() {
        return "Videojuego [titulo=" + titulo + ", genero=" + genero + ", horasJugadas=" + horasJugadas + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Videojuego videojuego = (Videojuego) obj;
        return java.util.Objects.equals(titulo, videojuego.titulo);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(titulo);
    }
}
