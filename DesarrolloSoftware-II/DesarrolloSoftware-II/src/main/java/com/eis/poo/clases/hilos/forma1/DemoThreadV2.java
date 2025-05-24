package com.eis.poo.clases.hilos.forma1;

public class DemoThreadV2 extends Thread{
    private int n=0;
    public DemoThreadV2(String nombre,int n) {
        super(nombre);
        this.n=n;
    }
    @Override
    public void run(){
        try
        {
            for(int i=0;i<n;i++)
            {
                int x=(int)(Math.random()*100);
                Thread.sleep(x);
                System.out.println(i+". Soy " + this.getName() + " Dormir: " + x +" Milisegundos");
            }
            System.out.println("Termina " + getName());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

}
