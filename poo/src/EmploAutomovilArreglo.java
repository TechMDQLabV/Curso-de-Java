import java.util.Arrays;

public class EmploAutomovilArreglo {
    public static void main(String[] args) {

        Person conductorSubaru = new Person("Luci", "Martinez");
        Automobile subaru = new Automobile("Subaru", "Impreza",Color.AZUL, new Engine(3.5, EngineType.NAFTA), new FuelTank(25));
        subaru.setOwner(conductorSubaru);
        subaru.setType(TypeAutomobile.CONVERTIBLE);

        Person conductorMazda = new Person("Pepe", "Argento");
        Automobile mazda = new Automobile("Mazda", "BT-50", Color.BLANCO, new Engine(2.5, EngineType.DIESEL), new FuelTank(35));
        mazda.setOwner(conductorMazda);
        mazda.setType(TypeAutomobile.COUPE);

        Person conductorNissan = new Person("Juana", "Molina");
        Automobile nissan = new Automobile("Nissan", "Navara", Color.GRIS, new Engine(2.0, EngineType.GAS), new FuelTank(30));
        nissan.setOwner(conductorNissan);
        nissan.setType(TypeAutomobile.PICKUP);

        Person conductorAudi = new Person("Pedro", "Aznar");
        Automobile audi = new Automobile("audi", "A3", Color.ROJO, new Engine(1.6, EngineType.NAFTA), new FuelTank(50));
        audi.setOwner(conductorAudi);
        audi.setType(TypeAutomobile.SEDAN);

        Person conductorFord = new Person("Pappo", "Napolitano");
        Automobile ford = new Automobile("Ford", "Falcon", Color.AZUL, new Engine(4.0, EngineType.NAFTA), new FuelTank(50));
        ford.setOwner(conductorFord);
        ford.setType(TypeAutomobile.SEDAN);

        Automobile[] cars = new Automobile[5];
        cars[0] = subaru;
        cars[1] = mazda;
        cars[2] = nissan;
        cars[3] = audi;
        cars[4] = ford;

        Arrays.sort(cars);

        for(Automobile c: cars){
            System.out.println(c.detail());
        }

        System.out.println(subaru.toString());
        System.out.println(subaru.detail());
        System.out.println(mazda.detail());
        System.out.println(nissan.detail());
        System.out.println(audi.detail());
    }
}
