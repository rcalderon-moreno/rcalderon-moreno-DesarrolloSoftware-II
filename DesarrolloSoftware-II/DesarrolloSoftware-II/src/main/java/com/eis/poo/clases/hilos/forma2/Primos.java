/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eis.poo.clases.hilos.forma2;

/**
 *
 * @author roger
 */
public class Primos implements Runnable {
    private int n;
    public Primos(int n) {this.n=n;}
    @Override
    public void run(){
        boolean sirve;
        try
        {
            for(int x=0;x<n;x++)
            {
                if(x==0)
                    System.out.println("Primo:" + x);
                else if (x==1)
                    System.out.println("Primo:" + x);
                else if (x==2)    
                    System.out.println("Primo:" + x);
                else
                {
                    sirve=true;
                    for(int y=2;y<x;y++)
                    {
                        double res=x%y;
                        if(res==0)
                        {
                            sirve=false;
                            break;
                        }                            
                    }
                    if(sirve==true)
                        System.out.println("Primo:" + x);
                }
            }  
            
            System.out.println("Termina thread " + Thread.currentThread().getName());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    
}
