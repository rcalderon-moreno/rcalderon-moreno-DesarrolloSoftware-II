package com.eis.conceptos.gestionhilos;

import com.eis.poo.clases.hilos.forma1.DemoThread;

public class HilosV6 extends Thread {

    public static void main(String[] args) {

        Thread hilo_principal = HilosV6.currentThread();
        System.out.println("Hilo principal " + hilo_principal.getName());
        DemoThread h1 = new DemoThread("Juan");
        DemoThread h2 = new DemoThread("Pedro");
        DemoThread h3 = new DemoThread("Luis");
        DemoThread h4 = new DemoThread("Cesar");

        h1.setPriority(Thread.MIN_PRIORITY);
        h2.setPriority(Thread.NORM_PRIORITY);
        h3.setPriority(Thread.MAX_PRIORITY);
        h4.setPriority(Thread.NORM_PRIORITY+3);

        //Iniciamos los hilos.
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        //Asignamos prioridades
        //Thread.MAX_PRIORITY=10     //Thread.MIN_PRIORITY=1     //Thread.NORM_PRIORITY=5

        System.out.println("Fin del Hilo principal " + hilo_principal.getName());

    }
}
