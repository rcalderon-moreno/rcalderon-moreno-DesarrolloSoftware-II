package com.eis.java_swing.integrar;

public class Persona {
    private double identificacion;
    private String nombres;
    private String apellidos;
    private String direccion;
    static int contadorObjetos;
    static int edadMinima;    
    public Persona() {}

    public Persona(double identificacion, String nombres, String apellidos, String direccion) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        //System.out.println("identificacion " + this.identificacion + " nombres " + this.nombres +" this.apellidos " + this.apellidos + " this.direccion " + this.direccion);
        
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    static
    {
        contadorObjetos=0;
        edadMinima=18;    
    }
    public double getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(double identificacion) {
        this.identificacion = identificacion;
    }
    
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
}

