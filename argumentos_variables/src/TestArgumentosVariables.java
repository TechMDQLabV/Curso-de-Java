public class TestArgumentosVariables {
    public static void main(String[] args) {
        System.out.println("====================================== Imprimiendo Numeros ======================================");
        printNumbers(1, 2, 3, 4, 5);
        System.out.println("====================================== Imprimiendo Numeros ======================================");
        printNumbers(10, 15, 40, 20, 80);
        System.out.println("====================================== Imprimiendo Strings ======================================");
        printStrings("Juan", "Pedro", "Pepe", "Jaime", "Maria");
    }
    private static void printNumbers(int... numbers){
        for(int i=0; i < numbers.length; i++){
            System.out.println("elemento: " + numbers[i]);
        }
    }

    private static void printNumbersBis(int... numbers){
        for(Integer i: numbers){
            System.out.println("elemento: " + i);
        }
    }

    private static void printStrings(String... words){
        for(String s: words){
            System.out.println("string: " + s);
        }
    }
}
