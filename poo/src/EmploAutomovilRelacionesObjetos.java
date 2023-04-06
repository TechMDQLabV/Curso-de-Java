public class EmploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        Person conductorSubaru = new Person("Luci", "Martinez");
        Automobile subaru = new Automobile("Subaru", "Impreza",Color.AZUL, new Engine(), new FuelTank());
        Wheel[] wheelsSubaru = new Wheel[5];
        for(int i = 0; i < wheelsSubaru.length; i++){
            subaru.addWheel(new Wheel("Yokohama", 16, 7.5));
        }
        subaru.setOwner(conductorSubaru);
        subaru.setType(TypeAutomobile.CONVERTIBLE);

        Person conductorMazda = new Person("Pepe", "Argento");
        Automobile mazda = new Automobile("Mazda", "BT-50", Color.BLANCO, new Engine(), new FuelTank());
        Wheel[] wheelsMazda = new Wheel[5];
        for(int i = 0; i < wheelsMazda.length; i++){
            mazda.addWheel(new Wheel("Michelin", 18, 10.5));
        }
        mazda.setOwner(conductorMazda);
        mazda.setType(TypeAutomobile.COUPE);

        Person conductorNissan = new Person("Juana", "Molina");
        Automobile nissan = new Automobile("Nissan", "Navara", Color.GRIS, new Engine(), new FuelTank());
        Wheel[] wheelsNissan = new Wheel[5];
        for(int i = 0; i < wheelsNissan.length; i++){
            nissan.addWheel(new Wheel("Pirelli", 16, 7.5));
        }
        nissan.setOwner(conductorNissan);
        nissan.setType(TypeAutomobile.PICKUP);

        System.out.println(subaru.toString());
        System.out.println(subaru.detail());
        System.out.println(mazda.detail());
        System.out.println(nissan.detail());
    }
}
