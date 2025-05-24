package com.eis.java_swing.integrar;
public class Estudiante extends Persona{
    private double codigo;
    private String programa;

    public Estudiante(double codigo, String programa, double identificacion, String nombres, String apellidos, String direccion) {
        super(identificacion, nombres, apellidos, direccion);
        this.codigo = codigo;
        this.programa = programa;
    }

    public Estudiante(double codigo, String programa) {
        this.codigo = codigo;
        this.programa = programa;
    }

   
    public Estudiante() {
    }
  
    
    
    
    
   
    public double getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getPrograma() {
        return programa;
    }
    public void setPrograma(String programa) {
        this.programa = programa;
    }
}
