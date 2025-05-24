package com.eis.conceptos.genericos;

import com.eis.poo.clases.Genericos.A;
import com.eis.poo.clases.Genericos.Parejas;
import com.eis.poo.clases.personal.Persona;

public class DatosGenericosV2 {
    public static void main(String[] args) {

        Parejas<Integer> p1=new Parejas <Integer>(4,2) ;
        Parejas <A> p2=new Parejas <A>(new A(8,0),new A(5,5)) ;
        Parejas <Character> p3=new Parejas <Character>('c','h') ;
        Parejas <Persona> p4=new Parejas <Persona>(
                new Persona(100.0,"AAA","BBB"),
                new Persona(20.0,"CCC","DDD")
        ) ;
        Parejas <String> p5=new Parejas <String>("CARRO","Carro") ;
        System.out.println("***Información***");
        System.out.println("Información de p1 " + p1.toString());
        System.out.println("Información de p2 " + p2.toString());
        System.out.println("Información de p3 " + p3.toString());
        System.out.println("Información de p4 " + p4.toString());
        System.out.println("Información de p5 " + p5.toString());
        System.out.println("***Intercambiar***");
        System.out.println("Intercambiar de p1 " + p1.intercambiar().toString());
        System.out.println("Intercambiar  de p2 " + p2.intercambiar().toString());
        System.out.println("Intercambiar  de p3 " + p3.intercambiar().toString());
        System.out.println("Intercambiar  de p4 " + p4.intercambiar().toString());
        System.out.println("Intercambiar  de p5 " + p5.intercambiar().toString());
        System.out.println("***El mayor de los dos ***");
        System.out.println("Mayor de p1  " + p1.elMayor().toString()  );
        System.out.println("Mayor de p2 " + p2.elMayor().toString()  );
        System.out.println("Mayor de p3 " + p3.elMayor().toString()  );
        System.out.println("Mayor de p4 " + p4.elMayor()  );
        System.out.println("Mayor de p5 " + p5.elMayor()  );
    }
}
