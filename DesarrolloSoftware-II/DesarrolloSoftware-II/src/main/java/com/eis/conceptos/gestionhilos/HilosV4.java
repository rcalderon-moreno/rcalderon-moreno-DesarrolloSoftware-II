package com.eis.conceptos.gestionhilos;

import com.eis.poo.clases.hilos.forma1.DemoThread;

public class HilosV4  extends Thread{
    public static void main(String[] args) {

        Thread hilo_principal = HilosV4.currentThread();
        System.out.println("Hilo principal " + hilo_principal.getName());
        DemoThread h1 = new DemoThread("Juan");
        DemoThread h2 = new DemoThread("Pedro");
        DemoThread h3 = new DemoThread("Luis");

        //Iniciamos los hilos.
        h1.start();
        h2.start();
        h3.start();
        //Esperamos a que el hilo principal termine
        try {
            h1.join();
            h2.join();
            h3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Fin del Hilo principal " + hilo_principal.getName());


    }
}
