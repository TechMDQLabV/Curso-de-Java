public class PasarPorReferencia {
    public static void main(String[] args) {
        int[] edades = {10, 11, 12};
        System.out.println("edades = " + edades);
        for(int i=0; i<edades.length; i++){
            System.out.println("edades = " + edades[i]);
        }
        System.out.println("Antes de llamar al metodo test ");
        test(edades);
        System.out.println("Despues de llamar al metodo test ");
        for(int i=0; i< edades.length; i++){
            System.out.println("edades = " + edades[i]);
        }
    }

    public static void test(int[] edades){
        System.out.println("Iniciamos el metodo test");
        for(int i=0; i<3; i++){
            edades[i]=25+i;
        }
        System.out.println("Finaliza el metodo test");
    }
}
