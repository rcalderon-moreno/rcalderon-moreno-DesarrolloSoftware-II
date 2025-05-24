package com.eis.conceptos.gestionhilos;

import com.eis.poo.clases.hilos.sincronizar.Datos;
import com.eis.poo.clases.hilos.sincronizar.Hilo;

public class HilosV7 extends Thread {

    public static void main(String[] args){
        System.out.println("Inicio de Hilo principal " + Thread.currentThread().getName() );
        Datos v=new Datos(3);
        Datos v1=new Datos(3);

        Hilo h1 = new Hilo(v);
        Hilo h2 = new Hilo(v);
        Hilo h3 = new Hilo(v);
        Hilo h4 = new Hilo(v);

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
