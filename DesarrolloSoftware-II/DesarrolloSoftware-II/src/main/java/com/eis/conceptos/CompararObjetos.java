package com.eis.conceptos;

import com.eis.poo.clases.puntos2D.Punto;

public class CompararObjetos {
    public static void main(String[] args) {

        Punto punto1 = new Punto(2,2);
        Punto punto2 = new Punto(1,2);
        Punto punto3 = new Punto(2,2);

        System.out.println("Comparar punto1 contra punto2 " +  punto1.equals(punto2));
        System.out.println("Comparar punto1 contra punto3 " +  punto1.equals(punto3));
        System.out.println("Comparar punto2 contra punto1 " +  punto2.equals(punto1));

        Punto punto4 = new Punto(4,0);
        Punto punto5 = new Punto(2,2);

        System.out.println("Comparar punto1 contra punto4 " +  punto1.compareTo(punto4));
        System.out.println("Comparar punto1 contra punto3 " +  punto1.compareTo(punto3));
        System.out.println("Comparar punto2 contra punto1 " +  punto2.compareTo(punto1));


    }
}
