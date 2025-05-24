/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eis.java_swing.integrar;
public class Control {
    private static Persona datos[];
    private static int contador;
    public Control(){        
        datos=new Persona[10];
        contador=0;
    }
    public static void insertarDato(Persona a)
    {
        datos[contador]=a;
        contador++;
    }
    public static int aumentarContador() {
        return contador++;
    }
    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Control.contador = contador;
    }

    public static Persona[] getDatos() {
        return datos;
    }

    public static void setDatos(Persona[] d) {
        Control.datos = d;
    }
    
    
    
}
