import java.lang.reflect.Method;

public class MetodoGetClass {
    public static void main(String[] args) {
        String text = "Hola que tal";

        Class strClass = text.getClass();
        System.out.println("strClass = " + strClass.getName());

        for(Method m: strClass.getDeclaredMethods()) {
            System.out.println("metodo.getName() = " + m.getName());
        }
    }
}
