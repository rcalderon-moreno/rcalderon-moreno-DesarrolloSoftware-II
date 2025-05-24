package com.eis.conceptos.gestionhilos;

import com.eis.poo.clases.hilos.sincronizar.Datos;
import com.eis.poo.clases.hilos.sincronizar.HiloRecursoExterno;

public class HiloV8  extends Thread {
    public static void main(String[] args){

        System.out.println("Inicio de Hilo principal " + Thread.currentThread().getName() );
        Datos v=new Datos(3);

        HiloRecursoExterno h1 = new HiloRecursoExterno(v);
        HiloRecursoExterno h2 = new HiloRecursoExterno(v);
        HiloRecursoExterno h3 = new HiloRecursoExterno(v);
        HiloRecursoExterno h4 = new HiloRecursoExterno(v);

        Thread h11=new Thread(h1,"JUAN");
        Thread h22=new Thread(h2,"LUIS");
        Thread h33=new Thread(h3,"CESAR");
        Thread h44=new Thread(h4,"PEDRO");

        h11.start();
        h22.start();
        h33.start();
        h44.start();

        try {
            h11.join();
            h22.join();
            h33.join();
            h44.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Fin del Hilo principal " + Thread.currentThread().getName() );

    }

}
