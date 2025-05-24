package com.eis.conceptos.gestionhilos;


import com.eis.poo.clases.hilos.forma1.DemoThreadV2;

public class HilosV2  extends Thread {
    public static void main(String cadena[]){
        Thread hilo_principal= HilosV2.currentThread();
        System.out.println("Hilo principal"+hilo_principal.getName());
        DemoThreadV2 h1=new DemoThreadV2("Juan",1000);
        DemoThreadV2 h2=new DemoThreadV2("Pedro",1000);
        DemoThreadV2 h3=new DemoThreadV2("Luis",1000);
        h1.start();
        h2.start();
        h3.start();
    }
}
