package com.eis.java_swing.integrar;

import java.util.Date;

public class Empleado extends Persona{
private String cargo;
private Date fechaIngreso;
private double salario;

    public Empleado(double identificacion, String nombres, String apellidos, String direccion) {
        super(identificacion, nombres, apellidos, direccion);
    }

    public Empleado() {
    }

  

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}
