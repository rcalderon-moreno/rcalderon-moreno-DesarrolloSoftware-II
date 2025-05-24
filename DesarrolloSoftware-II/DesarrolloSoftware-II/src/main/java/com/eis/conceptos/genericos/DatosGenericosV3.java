package com.eis.conceptos.genericos;

import com.eis.poo.clases.Genericos.ClaseGenericaMultiple;
import com.eis.poo.clases.personal.Persona;

public class DatosGenericosV3 {

    public static void main(String[] args) {

        ClaseGenericaMultiple <Integer,String> q1=
                new ClaseGenericaMultiple<>(100,"ABC");
        ClaseGenericaMultiple <Integer,Double> q2=
                new ClaseGenericaMultiple<>(100,0.25);
        ClaseGenericaMultiple <String, Persona> q3=
                new ClaseGenericaMultiple<>("UNILLANOS",new Persona());

        System.out.println(q1.toString());
        System.out.println(q2.toString());
        System.out.println(q3.toString());
    }
}

