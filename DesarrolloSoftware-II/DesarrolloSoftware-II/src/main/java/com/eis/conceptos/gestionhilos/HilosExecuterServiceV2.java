package com.eis.conceptos.gestionhilos;

import java.util.concurrent.*;

public class HilosExecuterServiceV2 {

    public static void main(String[] args) {

        ExecutorService hilo = Executors.newSingleThreadExecutor();

        Callable<Double> suma = () -> {
            double total = 0;
            for (double i = 1; i <= 1000000.0; i++) total += i;
            System.out.println("Ejecutando tarea en: " + Thread.currentThread().getName());
            return total;
        };

        Future<Double> resultado = hilo.submit(suma);

        try {
            System.out.println("Valor de la suma: " + resultado.get()); // Espera el resultado
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        hilo.shutdown();

        int numHilos=5;
        ExecutorService  hilo2 =  Executors.newFixedThreadPool(numHilos);

        for (double i = 0; i < numHilos; i++) {

            Future<Double> valor = hilo2.submit(suma);
            try {
                System.out.println("Valor de la suma: " + valor.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }

        }

        hilo2.shutdown();

        System.out.println("Fin del Hilo principal " + Thread.currentThread().getName() );


    }


}
