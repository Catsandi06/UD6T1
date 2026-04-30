package net.salesianos.reparacion;

import java.util.Objects;

public class Reparacion {
    private String codigo;
    private String cliente;
    private String descripcion;
    private boolean urgente;

    public Reparacion(String codigo, String cliente, String descripcion, boolean urgente) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.urgente = urgente;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public boolean isUrgente() { return urgente; }
    public void setUrgente(boolean urgente) { this.urgente = urgente; }

    @Override
    public String toString() {
        return "Reparacion [codigo=" + codigo + ", cliente=" + cliente + ", descripcion=" + descripcion + ", urgente=" + urgente + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Reparacion reparacion = (Reparacion) obj;
        return Objects.equals(codigo, reparacion.codigo);
    }
}
