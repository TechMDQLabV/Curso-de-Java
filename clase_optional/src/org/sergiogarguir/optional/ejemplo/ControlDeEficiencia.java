package org.sergiogarguir.optional.ejemplo;

import org.sergiogarguir.optional.ejemplo.models.Address;
import org.sergiogarguir.optional.ejemplo.models.Person;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

public class ControlDeEficiencia {

    private static Logger LOGGER = Logger.getLogger("ControlDeEficiencia");
    public static int CANTIDAD = 100000;

    public static void main(String[] args) {
        //List<Person> persons = buildPersons(CANTIDAD);

        //persons.forEach(System.out::println);
        LOGGER.info("titulo");

        for (int i = 0; i < 10; i++){
            List<Person> persons = null;
            persons = buildPersons(CANTIDAD);
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("Iteration " + (i + 1));
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("------------------------------------------------------------------------------------");

            // select a random number for concat with name to search
            int randomNumber = (int)(Math. random()*CANTIDAD+1);

            System.out.println("Searching: \"Pepe "+randomNumber+"\"");

            // Run find method with bucle
            long startTimeHS = System.currentTimeMillis();
            Person personFor = findName(persons, "Pepe " + randomNumber);
            if (personFor!=null) {
                System.out.print("Find with bucle in ");
            } else {
                System.out.print("Not found with bucle in ");
            }
            System.out.println(System.currentTimeMillis() - startTimeHS + "ms");
            System.out.println(personFor);
            System.out.println("======================================================================");

            // Run find method with lamda anyMatch
            long startTimeHSLamdaAnyMatch = System.currentTimeMillis();
            boolean foundIt = findNameWithLambdaAnyMatch(persons, "Pepe " + randomNumber);
            if (foundIt) {
                System.out.print("Find with lamdaAnyMatch in ");
            } else {
                System.out.print("Not found with lamdaAnyMatch in ");
            }
            System.out.println(System.currentTimeMillis() - startTimeHSLamdaAnyMatch + "ms");
            System.out.println("======================================================================");

            // Run find method with lamda
            long startTimeHSLamda = System.currentTimeMillis();
            Person personStream = findNameWithLambda(persons, "Pepe " + randomNumber);
            if (personStream!=null) {
                System.out.print("Find with lamda in ");
            } else {
                System.out.print("Not found with lamda in ");
            }
            System.out.println(System.currentTimeMillis() - startTimeHSLamda + "ms");
            System.out.println(personStream);
            System.out.println("======================================================================");
        }

    }
/*
    public static boolean findName(List<Person> people, String name) {
        for (Person person : people)
            if (person.getName().equals(name))
                return true;

        return false;
    }
*/
    public static Person findName(List<Person> people, String name) {
        Person p = null;
        for (Person person : people)
            if (person.getName().equals(name))
                return person;

        return p;
    }

    public static boolean findNameWithLambdaAnyMatch(List<Person> people, String name) {
        return people.stream()
                .anyMatch(p -> p.getName().equals(name));
    }

    public static Person findNameWithLambda(List<Person> people, String name) {
        return people.stream()
                .filter(p -> p.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public static List<Person> buildPersons(int cantidad){
        List<Person> persons = new ArrayList<>();

        for(int i=0;i<cantidad;i++){
            persons.add(getNewPerson(i));
        }

        return persons;
    }

    private static Person getNewPerson(int i){
        Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        Person p = new Person("Pepe "+i, "Argento "+i);
        p.setDni((int) (Math.random()*100000));
        p.setAddress(getNewAddress(i));
        p.setBirthDate(formatter.format(new Date()));

        return p;
    }

    private static Address getNewAddress(int i){
        return new Address("Street "+i, String.valueOf(i), "Mar del Plata");
    }
}
