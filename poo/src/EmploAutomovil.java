public class EmploAutomovil {
    public static void main(String[] args) {
        Automobile subaru = new Automobile("Subaru", "Impreza",Color.BLANCO, new Engine(), new FuelTank());
        Automobile mazda = new Automobile("Mazda", "BT-50", Color.AZUL, new Engine(), new FuelTank());
        Automobile nissan = new Automobile("Nissan", "Navara", Color.GRIS, new Engine(), new FuelTank());

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
    }
}
