package com.eis.conceptos.estructuras;

import com.eis.poo.clases.personal.Persona;

import java.util.Enumeration;
import java.util.Hashtable;

public class TipoMap {

    public static void main(String[] args) {

        Hashtable<String, Persona> tablaHash=new Hashtable<String,Persona>();
        Persona persona=new Persona(1,"JUAN","RODRIGUEZ");
        Persona persona1=new Persona(2,"LUIS","SILVA");
        Persona persona2=new Persona(3,"CESAR","RUIZ");

        tablaHash.put(persona.getNombres(),persona);
        tablaHash.put(persona1.getNombres(),persona1);
        tablaHash.put(persona2.getNombres(),persona2);

        System.out.println("Buscar: " + tablaHash.get(persona.getNombres()));
        System.out.println("Buscar: " + tablaHash.get(persona1.getNombres()));
        System.out.println("Buscar: " + tablaHash.get(persona2.getNombres()));
        System.out.println("Tamaño de la tabla: " + tablaHash.size() );
        System.out.println("Buscar una clave dentro de la tabla: "+ tablaHash.get("JAVIER") ); // Retorna null cuando no encuentra


        System.out.println("OBTENER LAS KEYS DE LA TABLA:");
        Enumeration<String> keys=tablaHash.keys();
        while(keys.hasMoreElements())
            System.out.println( keys.nextElement());
        System.out.println("***OBTENER EL VALOR DE LA TABLA***");
        System.out.println( tablaHash.get("LUIS").toString());
        Enumeration<Persona> valor=tablaHash.elements();
        while(valor.hasMoreElements())
            System.out.println( valor.nextElement());

        System.out.println("***NUEVA PERSONA***");
        Persona x4=new Persona(4,"JUAN","ROMERO");
        tablaHash.put(x4.getNombres(),x4);
        System.out.println(tablaHash.get(persona.getNombres()));
        System.out.println(tablaHash.get(persona1.getNombres()));
        System.out.println(tablaHash.get(persona2.getNombres()));
        System.out.println(tablaHash.get(x4.getNombres()));


    }
}
