

package com.eis.poo.clases.hilos.forma2;

public class Potencias2  implements Runnable {

    private int n;
    public Potencias2 (int n) {
        this.n=n;
    }

    @Override
    public void run(){
        try
        {
            for(int x=0;x<=this.n;x++)
                System.out.println("Soy " + Thread.currentThread().getName() + " "  + 
                        " Potencia de 2 a la  " + x + " es " + Math.pow(2, x) );
            
            System.out.println("Termina thread " + Thread.currentThread().getName());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }        
    }
}

