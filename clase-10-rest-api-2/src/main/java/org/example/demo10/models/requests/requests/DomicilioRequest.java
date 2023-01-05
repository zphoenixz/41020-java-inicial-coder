package org.example.demo10.requests;

import java.util.Objects;

public class DomicilioRequest {
    private String calle;
    private int numero;
    private int piso;
    private String departamento;
    private String localidad;
    private String cp;
    private String provincia;
    private long idCliente;

    public DomicilioRequest() {
    }

    public DomicilioRequest(String calle, int numero, int piso, String departamento, String localidad, String cp, String provincia, long idCliente) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.departamento = departamento;
        this.localidad = localidad;
        this.cp = cp;
        this.provincia = provincia;
        this.idCliente = idCliente;
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

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DomicilioRequest that)) return false;
        return getNumero() == that.getNumero() && getPiso() == that.getPiso() && getIdCliente() == that.getIdCliente() && Objects.equals(getCalle(), that.getCalle()) && Objects.equals(getDepartamento(), that.getDepartamento()) && Objects.equals(getLocalidad(), that.getLocalidad()) && Objects.equals(getCp(), that.getCp()) && Objects.equals(getProvincia(), that.getProvincia());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCalle(), getNumero(), getPiso(), getDepartamento(), getLocalidad(), getCp(), getProvincia(), getIdCliente());
    }

    @Override
    public String toString() {
        return "DomicilioRequest{" +
                "calle='" + calle + '\'' +
                ", numero=" + numero +
                ", piso=" + piso +
                ", departamento='" + departamento + '\'' +
                ", localidad='" + localidad + '\'' +
                ", cp='" + cp + '\'' +
                ", provincia='" + provincia + '\'' +
                ", idCliente=" + idCliente +
                '}';
    }
}
