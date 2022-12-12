package org.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "DOMICILIO")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "CALLE")
    private String calle;

    @Column(name = "NUMERO")
    private int numero;

    @Column(name = "PISO")
    private int piso;

    @Column(name = "DEPARTAMENTO")
    private String departamento;

    @Column(name = "CP")
    private String cp;

    @Column(name = "LOCALIDAD")
    private String localidad;

    @Column(name = "PROVINCIA")
    private String provincia;

    @ManyToOne(fetch = FetchType.LAZY)
    private Cliente cliente;

    public Domicilio(String calle, int numero, int piso, String departamento, String cp, String localidad, String provincia, Cliente cliente) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.departamento = departamento;
        this.cp = cp;
        this.localidad = localidad;
        this.provincia = provincia;
        this.cliente = cliente;
    }

    public Domicilio(long id, String calle, int numero, int piso, String departamento, String cp, String localidad, String provincia, Cliente cliente) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.departamento = departamento;
        this.cp = cp;
        this.localidad = localidad;
        this.provincia = provincia;
        this.cliente = cliente;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Domicilio domicilio)) return false;
        return id == domicilio.id && numero == domicilio.numero && piso == domicilio.piso && Objects.equals(calle, domicilio.calle) && Objects.equals(departamento, domicilio.departamento) && Objects.equals(cp, domicilio.cp) && Objects.equals(localidad, domicilio.localidad) && Objects.equals(provincia, domicilio.provincia) && Objects.equals(cliente, domicilio.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, calle, numero, piso, departamento, cp, localidad, provincia, cliente);
    }
}
