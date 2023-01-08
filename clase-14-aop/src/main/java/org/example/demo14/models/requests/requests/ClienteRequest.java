package org.example.demo14.models.requests.requests;

import java.util.Objects;

public class ClienteRequest {

    private String nombre;
    private String apellido;
    private long dni;

    public ClienteRequest() {
    }

    public ClienteRequest(String nombre, String apellido, long dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClienteRequest that)) return false;
        return getDni() == that.getDni() && Objects.equals(getNombre(), that.getNombre()) && Objects.equals(getApellido(), that.getApellido());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getApellido(), getDni());
    }

    @Override
    public String toString() {
        return "ClienteRequest{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                '}';
    }
}
