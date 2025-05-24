

package com.eis.poo.clases.hilos.sincronizar;
public class Hilo implements Runnable {
    Datos p;
    String nombre;
    public Hilo(Datos a) {
            super();
            this.p=a;
    }    
    @Override
    public void run(){
        try{
                System.out.println("Soy " + Thread.currentThread().getName() + " Resultado es " + p.sumar());
        }
        catch(Exception e){
            e.printStackTrace();
        }        
    }
}

