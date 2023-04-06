class Persona{
    private String name;

    public Persona(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {
        Persona persona = new Persona("");
        persona.setName("Pepe");
        Persona[] personas = new Persona[100];

        personas[0] = new Persona("Juan");

        for(Persona p: personas){
            System.out.println("p.getName() = " + p.getName());
        }
        System.out.println("Tamaño del arreglo: " + personas.length);

        System.out.println("Persona: " + persona.getName());

        System.out.println("Antes de llamar al metodo test ");
        test(persona);
        System.out.println("Despues de llamar al metodo test ");
        System.out.println("Persona: " + persona.getName());
    }

    public static void test(Persona p){
        System.out.println("Iniciamos el metodo test");

        p.setName("Otro Pepe");

        System.out.println("Finaliza el metodo test");
    }
}
