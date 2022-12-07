package org.example.demo.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;


@Entity
@Table(name = "ALUMNO")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Alumno {
    public Alumno() {
    }
    public Alumno(String nombre, String apellido, long dni, long legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.legajo = legajo;
    }

    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "APELLIDO")
    private String apellido;
    @Id
    @Column(name = "DNI")
    private long dni;
    @Column(name = "LEGAJO")
    private long legajo;

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

    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumno alumno)) return false;
        return getDni() == alumno.getDni() && getLegajo() == alumno.getLegajo() && Objects.equals(getNombre(), alumno.getNombre()) && Objects.equals(getApellido(), alumno.getApellido());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getApellido(), getDni(), getLegajo());
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", legajo=" + legajo +
                '}';
    }
}
