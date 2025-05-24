package com.eis.conceptos.estructuras;
import com.eis.poo.clases.personal.Persona;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;

public class TipoMapV2 {
    public static void main(String[] args) {

        Hashtable<String, LinkedList<Persona>> tablaHash=new Hashtable<String,LinkedList<Persona>>();
        LinkedList<Persona>  lista = new LinkedList<Persona>();
        LinkedList<Persona>  lista2 = new LinkedList<Persona>();
        LinkedList<Persona>  lista3 = new LinkedList<Persona>();

        Persona x5=new Persona(5,"JUAN","ZAPATA");
        Persona x6=new Persona(6,"JUAN","MORENO");
        Persona x7=new Persona(7,"MARIANA","DIAZ");
        Persona x8=new Persona(8,"JUAN","CARDENAS");
        Persona x9=new Persona(9,"DANIELA","RIVEROS");
        Persona x10=new Persona(10,"JUAN","SANCHEZ");

        lista.add(x5);
        lista2.add(x7);
        lista2.add(x9);

        tablaHash.put(x5.getNombres(), lista );
        tablaHash.put(x7.getNombres(), lista2);
        tablaHash.put(x9.getNombres(), lista3);

        if(tablaHash.get(x6.getNombres())!=null)
            lista.add(x6);
        if(tablaHash.get(x8.getNombres())!=null)
            lista.add(x8);
        if(tablaHash.get(x10.getNombres())!=null)
            lista.add(x10);

        System.out.println("***KEYS DE LA TABLA***");
        Enumeration<String> keys=tablaHash.keys();
        while(keys.hasMoreElements())
            System.out.println( keys.nextElement());
        System.out.println("***VALORES DE LA TABLA***");

        Enumeration<LinkedList<Persona>> valor=tablaHash.elements();
        while(valor.hasMoreElements())
        {
            LinkedList<Persona> tmp=valor.nextElement();
            for(Persona x:tmp)
                System.out.println( x.toString());
        }


        
    }
}
