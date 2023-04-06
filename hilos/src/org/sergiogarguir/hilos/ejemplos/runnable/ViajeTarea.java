package org.sergiogarguir.hilos.ejemplos.runnable;

public class ViajeTarea implements Runnable{
    private String name;

    public ViajeTarea(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println(i + " - " + this.name);
            try {
                Thread.sleep((long)Math.random()*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Fin del hilo " + " - " + this.name);
    }
}
