

package com.eis.poo.clases.hilos.forma1;

    public class DemoThread extends Thread{

        public DemoThread(String nombre) {
            super(nombre);
        }
        @Override
        public void run(){
            try
            {
                long tiempoInicioUno = System.nanoTime();
                long tiempoInicioDos = System.currentTimeMillis();

                for(double x=0;x<100000.0;x++)
                    System.out.println("Soy " + this.getName() + ": " + x);

                long tiempoFinalUno = System.nanoTime();
                long tiempoFinalDos = System.currentTimeMillis();
                System.out.println("***Termina thread " + getName() +
                        " Tiempo de ejecución de "+ getName() +": " + (tiempoFinalDos - tiempoInicioDos) + " ms.");
                //System.out.println("\nTiempo de ejecución: " + (tiempoFinalUno - tiempoInicioUno) + " ns.");
                //System.out.println("\nTiempo de ejecución: " + ((tiempoFinalDos - tiempoInicioDos)/1000) + " s.");
            }
            catch(Exception e) {   e.printStackTrace();   }
        }
    }



