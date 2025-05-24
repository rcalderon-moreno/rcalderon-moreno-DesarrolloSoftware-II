package com.eis.conceptos.gestionhilos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HilosExecuterService {
    public static void main(String[] args) {

        ExecutorService  h1 = Executors.newSingleThreadExecutor();
        h1.execute(
                    () -> System.out.println("Ejecutando tarea en un solo hilo")
        );
        h1.shutdown();

        ExecutorService  h2 = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            h2.execute(
                            () -> System.out.println("Ejecutando tarea en: " + Thread.currentThread().getName())
            );
        }
        h2.shutdown();


        ExecutorService h3 = Executors.newFixedThreadPool(3);
        Runnable tarea = () -> {
            System.out.println("Tarea ejecutada por: " + Thread.currentThread().getName());
        };

        for (int i = 0; i < 5; i++) {
            h3.execute(tarea);
        }

        h3.shutdown();

        System.out.println("Fin del Hilo principal " + Thread.currentThread().getName() );

    }

}
