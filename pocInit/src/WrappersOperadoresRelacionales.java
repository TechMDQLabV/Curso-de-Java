public class WrappersOperadoresRelacionales {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto " + (num1 == num2));

        num2 = 1000;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto " + (num1 == num2));

        Integer[] arreglo1 = {1,2,3};
        Integer[] arreglo2 = {4,5,6};

        System.out.println(arreglo1);
        System.out.println(arreglo2);
    }
}
