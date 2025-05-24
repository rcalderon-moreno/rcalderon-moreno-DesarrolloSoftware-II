package com.eis.conceptos.estructuras;

import com.eis.poo.clases.personal.Persona;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class TipoList {

    public static void main(String[] args) {

        ArrayList<Persona> lista = new ArrayList<>();
        Persona persona = new Persona();
        persona=new Persona(1,"Nombres","Apellidos");
        lista.add(persona);
        persona=new Persona(2,"Nombres","Apellidos");
        lista.add(persona);
        persona=new Persona(3,"Nombres","Apellidos");
        lista.add(persona);

        System.out.println("Cantidad de objetos:\t" + lista.size());
        System.out.println("Listado:\t" + lista.toString());
        System.out.println("Objeto posición 2:\t"+ lista.get(1) );
        System.out.println("Remover objetos posición 1 :\t" +lista.remove(1));
        System.out.println("Remover objeto persona :\t" +lista.remove(persona));
        System.out.println("Remover objeto persona :\t" +lista.remove(persona));
        System.out.println("Listado:\t" + lista.toString());

        lista.clear();

        System.out.println("Listado:\t" + lista.toString());
        lista.add(new Persona(6,"Nombres","Apellidos"));
        lista.add(new Persona(5,"Nombres","Apellidos"));
        lista.add(new Persona(4,"Nombres","Apellidos"));
        System.out.println("Listado:\t" + lista.toString());

        Collections.sort(lista);

        System.out.println("Listado:\t" + lista.toString() );

/*
        LinkedList<Integer> listadoEnteros= new LinkedList<>();
        LinkedList<Persona> listadoPersonas= new LinkedList<>();

        listadoEnteros.add(1);
        listadoEnteros.add(111);
        listadoEnteros.add(1);

        listadoPersonas.add(
                new Persona(4,"Nombres","Apellidos")
        );
        listadoPersonas.add(
                new Persona(0,"Nombres","Apellidos")
        );

        for (Integer valor : listadoEnteros) {
            System.out.println("valor=" + valor);
        }

        for (Persona persona : listadoPersonas) {
            System.out.println("Identificación=" + persona.getIdentificacion());
        }

        System.out.println("Listado:\t" + listadoEnteros.toString());
        listadoEnteros.add(1);
        listadoEnteros.add(10);

        System.out.println("Listado:\t" + listadoEnteros.toString());
        System.out.println("Primer valor=" + listadoEnteros.getFirst() );
        System.out.println("último valor=" + listadoEnteros.getLast());


        Collections.sort(listadoEnteros);
        System.out.println("Listado:\t" + listadoEnteros.toString());

        Collections.sort(listadoEnteros, Collections.reverseOrder());
        System.out.println("Listado:\t" + listadoEnteros.toString());

        Collections.sort(listadoPersonas);
        System.out.println("Listado personas:\t" + listadoPersonas.toString());
        listadoEnteros.clear();

*/








    }

}
