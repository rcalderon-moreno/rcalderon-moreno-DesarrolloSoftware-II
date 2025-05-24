
package com.eis.poo.clases.personal;

public class Persona implements Comparable {
    private double identificacion;
    private String nombres;
    private String apellidos;
    private double edad;
    private String direccion;
    private String telefono;
    String email;

    public  Persona() {}

    public  Persona(double identificacion, String nombres, String apellidos) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = -1;
        this.direccion = "---";
        this.telefono = "---";
    }

    public Persona(double identificacion, String nombres, String apellidos, double edad, String direccion, String telefono, String email) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    @Override
    public int compareTo(Object obj) {

        if (  obj instanceof Persona )
        {
            Persona tmp = (Persona)obj;
            if (this.identificacion== tmp.identificacion)
                return 0;
            else if (this.identificacion >  tmp.identificacion)
                return 1;
            else
                return -1;
        }
        else
            return 0;
    }


    public double IdPersona() {
        return identificacion;
    }
    public double getIdentificacion() {
        return identificacion;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getNombres() {
        return this.nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String informacionPersona() {
        return "Persona{" +
                "identificacion=" + identificacion +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Persona{" +
                "identificacion=" + identificacion +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
