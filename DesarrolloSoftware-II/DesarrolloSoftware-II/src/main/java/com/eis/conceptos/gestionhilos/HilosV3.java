package com.eis.conceptos.gestionhilos;

import com.eis.poo.clases.hilos.forma2.DemoRunnable;
import com.eis.poo.clases.hilos.forma2.Potencias2;
import com.eis.poo.clases.hilos.forma2.Primos;

public class HilosV3  extends Thread {

    public static void main(String[] args) {

        Thread hilo_principal= HilosV3.currentThread();
        System.out.println("Hilo principal"+hilo_principal.getName());
        DemoRunnable p=new DemoRunnable();
        DemoRunnable q=new DemoRunnable();

        Thread h1=new Thread(p,"Juan");
        Thread h2=new Thread(q,"Pedro");
        Thread h3=new Thread(new DemoRunnable(),"Luis");
        Thread h4=new Thread(new Potencias2(16),"Potencia");
        Thread h5=new Thread(new Primos(1000),"Primos");

         h1.start();
         h2.start();
         h3.start();
         h4.start();
         h5.start();

    }

}
