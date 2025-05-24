package com.eis.poo.clases.hilos.sincronizar;


    public class HiloRecursoExterno implements Runnable {
        Datos p;
        String nombre;
        public HiloRecursoExterno(Datos a) {
            super();
            this.p=a;
        }
        @Override
        public void run(){
            try{
                System.out.println("Intento ingresar: " + Thread.currentThread().getName() );

                synchronized(p){
                    //instrucciones a sincronizar.
                    System.out.println("Soy " + Thread.currentThread().getName() + " Resultado es " + p.sumar());
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

