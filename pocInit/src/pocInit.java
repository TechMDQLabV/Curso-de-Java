import java.util.*;

public class pocInit {
    public static void main(String[] args) {
        int intPrimitivo = 32768;
        Integer intObjeto1 = Integer.valueOf(32768);
        Integer intObjeto2 = intPrimitivo;

        int num1 = intObjeto1;
        int num2 = intObjeto2.intValue();

        String valor = "32768";
        int num3 = Integer.valueOf(valor);

    }
}
