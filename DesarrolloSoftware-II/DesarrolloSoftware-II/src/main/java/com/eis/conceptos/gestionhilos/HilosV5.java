package com.eis.conceptos.gestionhilos;

import com.eis.poo.clases.hilos.forma1.DemoThread;
import com.eis.poo.clases.hilos.forma2.DemoRunnable;

public class HilosV5  extends Thread {
    public static void main(String[] args) {

        Thread hilo_principal = HilosV5.currentThread();
        System.out.println("Hilo principal " + hilo_principal.getName());
        DemoThread h1 = new DemoThread("Juan");
        DemoRunnable p=new DemoRunnable();
        DemoRunnable q=new DemoRunnable();
        Thread h11=new Thread(p,"Juan11");
        Thread h22=new Thread(q,"Pedro22");
        //Iniciamos los hilos.
        h1.start();
        h11.start();
        h22.start();
        do{
            System.out.println(".");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }while(h1.isAlive()==true||h11.isAlive()==true||h22.isAlive()==true);


        //Esperamos a que termine el hilo principal.
        System.out.println("Fin del Hilo principal " + hilo_principal.getName());


    }
}
