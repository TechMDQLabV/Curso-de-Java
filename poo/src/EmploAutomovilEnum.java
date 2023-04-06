public class EmploAutomovilEnum {
    public static void main(String[] args) {
        Automobile subaru = new Automobile("Subaru", "Impreza",Color.AZUL, new Engine(), new FuelTank());
        subaru.setType(TypeAutomobile.CONVERTIBLE);
        Automobile mazda = new Automobile("Mazda", "BT-50", Color.BLANCO, new Engine(), new FuelTank());
        mazda.setType(TypeAutomobile.COUPE);
        Automobile nissan = new Automobile("Nissan", "Navara", Color.GRIS, new Engine(), new FuelTank());
        nissan.setType(TypeAutomobile.PICKUP);

        TypeAutomobile[] type = TypeAutomobile.values();
        
        for(TypeAutomobile t: type){
            System.out.println("t = " + t);
        }

        System.out.println(subaru.toString());
        System.out.println(subaru.detail());
        System.out.println(mazda.detail());
        System.out.println(nissan.detail());

        System.out.println(subaru.speedUp(50));
        System.out.println(subaru.brake());
        System.out.println(mazda.speedUpBrake(100));
        System.out.println("Kilómetros por litro: " + subaru.calculateConsuption(500, 0.6f));
        System.out.println("Kilómetros por litro: " + mazda.calculateConsuption(500, 60));
        System.out.println("Kilómetros por litro: " + nissan.calculateConsuption(400, 60));
        System.out.println(subaru);
        System.out.println("Velocidad Máxima en Ciudad: " + Automobile.CITY_MAX_SPEED);
        System.out.println("Velocidad Máxima en Ruta: " + Automobile.ROUTE_MAX_SPEED);
    }
}
