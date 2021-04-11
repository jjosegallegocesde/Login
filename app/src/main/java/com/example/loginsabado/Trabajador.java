package com.example.loginsabado;


import java.io.Serializable;

public class Trabajador implements Serializable {

    String nombreEmpleado,cedulaEmpleado,ocupacionEmpleado,descripcionEmpleado;
    int fotoEmpelado;

    public Trabajador(String nombreEmpleado, String cedulaEmpleado, String ocupacionEmpleado, String descripcionEmpleado, int fotoEmpelado) {
        this.nombreEmpleado = nombreEmpleado;
        this.cedulaEmpleado = cedulaEmpleado;
        this.ocupacionEmpleado = ocupacionEmpleado;
        this.descripcionEmpleado = descripcionEmpleado;
        this.fotoEmpelado = fotoEmpelado;
    }


    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(String cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public String getOcupacionEmpleado() {
        return ocupacionEmpleado;
    }

    public void setOcupacionEmpleado(String ocupacionEmpleado) {
        this.ocupacionEmpleado = ocupacionEmpleado;
    }

    public String getDescripcionEmpleado() {
        return descripcionEmpleado;
    }

    public void setDescripcionEmpleado(String descripcionEmpleado) {
        this.descripcionEmpleado = descripcionEmpleado;
    }

    public int getFotoEmpelado() {
        return fotoEmpelado;
    }

    public void setFotoEmpelado(int fotoEmpelado) {
        this.fotoEmpelado = fotoEmpelado;
    }
}
