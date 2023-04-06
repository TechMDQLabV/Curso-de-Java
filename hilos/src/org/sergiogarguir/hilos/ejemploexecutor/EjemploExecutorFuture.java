package org.sergiogarguir.hilos.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> tarea = () -> {
            System.out.println("Inicio de la tarea... ");
            try {
                System.out.println("Nombre del thread " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea ....");
            return "Algún resultado importante de la tarea";
        };
        Future<String> resultado = executor.submit(tarea);
        executor.shutdown();
        System.out.println("Continuando la ejecucion del main");
        //System.out.println(resultado.isDone());
        while(!resultado.isDone()){
            System.out.println("Ejecutando tarea ........");
            TimeUnit.MILLISECONDS.sleep(1500);
        }
        System.out.println(resultado.get());
        System.out.println(resultado.isDone());
        System.out.println("Continuando..........");
    }
}
