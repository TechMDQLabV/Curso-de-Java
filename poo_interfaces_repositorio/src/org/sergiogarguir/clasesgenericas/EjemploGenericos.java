package org.sergiogarguir.clasesgenericas;

public class EjemploGenericos {
    public static void main(String[] args) {
        Camion<Animal> transporteCaballos = new Camion(5);
        transporteCaballos.add(new Animal("Peregrino", "Caballo"));
        transporteCaballos.add(new Animal("Grillo", "Caballo"));
        transporteCaballos.add(new Animal("Tunquen", "Caballo"));
        transporteCaballos.add(new Animal("Topocalma", "Caballo"));
        transporteCaballos.add(new Animal("Longotoma", "Caballo"));

        System.out.println("========================= Camion de Caballos ===============================");
        /*for (Animal a: transporteCaballos){
            System.out.println("Nombre: " + a.getNombre() + " Especie: " + a.getEspecie());
        }*/
        imprimirCamion(transporteCaballos);
        Camion<Maquinaria> transporteMaquinas = new Camion(5);
        transporteMaquinas.add(new Maquinaria("Bulldozer"));
        transporteMaquinas.add(new Maquinaria("Grua Horquilla"));
        transporteMaquinas.add(new Maquinaria("Perforadora"));
        transporteMaquinas.add(new Maquinaria("Pala Mecanica"));
        transporteMaquinas.add(new Maquinaria("Volcador"));
        System.out.println("========================= Camion de Maquinarias ===============================");
        imprimirCamion(transporteMaquinas);

        Camion<Automovil> transporteAutomovil = new Camion(5);
        transporteAutomovil.add(new Automovil("Toyota"));
        transporteAutomovil.add(new Automovil("Mercedes Benz"));
        transporteAutomovil.add(new Automovil("Torino"));
        transporteAutomovil.add(new Automovil("Ford"));
        transporteAutomovil.add(new Automovil("Chevrolet"));
        System.out.println("========================= Camion de Automóviles ===============================");
        imprimirCamion(transporteAutomovil);

    }
    public static <T> void imprimirCamion(Camion<T> camion){
        for (T a: camion) {
            if (a instanceof Animal) {
                System.out.println("Nombre: " + ((Animal) a).getNombre() + " Especie: " + ((Animal) a).getEspecie());
            } else if (a instanceof Automovil) {
                System.out.println("Tipo: " + ((Automovil) a).getMarca());
            } else if (a instanceof Maquinaria) {
                System.out.println("Tipo: " + ((Maquinaria) a).getTipo());
            }
        }
    }
}
