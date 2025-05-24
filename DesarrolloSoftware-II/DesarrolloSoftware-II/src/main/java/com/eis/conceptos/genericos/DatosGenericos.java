package com.eis.conceptos.genericos;

import com.eis.poo.clases.Genericos.ClaseGenerica;
import com.eis.poo.clases.personal.Persona;
import com.eis.poo.clases.puntos2D.Punto;

public class DatosGenericos {
    public static void main(String[] args) {

        Persona persona = new Persona();
        ClaseGenerica<String> objeto1=new ClaseGenerica<String>("ABC");
        ClaseGenerica <Integer> objeto2=new ClaseGenerica<Integer>(123);
        ClaseGenerica <Double> objeto3=new ClaseGenerica<>(12.20);

        ClaseGenerica <Persona> objeto4=new ClaseGenerica<Persona>(persona);
        ClaseGenerica <Punto> objeto5=new ClaseGenerica<>();
        objeto5.setObj(new Punto(3,2));

        System.out.println("objeto1-->" + objeto1.toString());
        System.out.println("objeto2-->" + objeto2.toString());
        System.out.println("objeto3-->" + objeto3.toString());
        System.out.println("objeto4-->" + objeto4.toString());
        System.out.println("objeto5-->" + objeto5.toString());

    }
}
