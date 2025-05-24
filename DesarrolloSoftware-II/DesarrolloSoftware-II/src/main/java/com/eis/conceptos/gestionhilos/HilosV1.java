
package com.eis.conceptos.gestionhilos;

import com.eis.poo.clases.hilos.forma1.DemoThread;

public class HilosV1 extends Thread{
    public static void main(String cadena[]){
        Thread hilo_principal= HilosV1.currentThread();
        System.out.println("Hilo principal"+hilo_principal.getName());        
        DemoThread h1=new DemoThread("Juan");
        DemoThread h2=new DemoThread("Pedro");
        DemoThread h3=new DemoThread("Luis");        
        DemoThread h4=new DemoThread("xyz");
        h1.start();
        h2.start();
        h3.start();
        h4.start();
    }
}




