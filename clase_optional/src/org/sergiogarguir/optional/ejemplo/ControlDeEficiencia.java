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
    public static int CANTIDAD = 1900000;

    public static String DOUBLE_LINE = "========================================================================================================================================================================";

    public static String SIMPLE_LINE = "------------------------------------------------------------------------------------";

    public static void main(String[] args) {
        //List<Person> persons = buildPersons(CANTIDAD);

        //persons.forEach(System.out::println);
        LOGGER.info("titulo");

        String name;
        for (int i = 0; i < 1; i++){
            System.out.println(SIMPLE_LINE);
            System.out.println(SIMPLE_LINE);
            System.out.println("Iteration " + (i + 1));
            System.out.println(SIMPLE_LINE);
            System.out.println(SIMPLE_LINE);

            // select a random number for concat with name to search
            int randomNumber = (int)(Math. random()*CANTIDAD+1);
            //name = personsFor.get(personsFor.size()-1).getName();
            name = "Pepe " + (CANTIDAD - 1);
            System.out.println("Searching: \"Pepe "+randomNumber+"\"");

            // Run find method with While
            List<Person> personsWhile = buildPersons(CANTIDAD);
            long startTimeHSWhile = System.currentTimeMillis();
            Person personWhile = findNameWhile(personsWhile, name);
            if (personWhile!=null) {
                System.out.print("Find with While in ");
            } else {
                System.out.print("Not found with While in ");
            }
            System.out.println(System.currentTimeMillis() - startTimeHSWhile + "ms");
            System.out.println(personWhile);
            System.out.println(DOUBLE_LINE);

            // Run find method with for
            List<Person> personsFor = buildPersons(CANTIDAD);
            long startTimeHS = System.currentTimeMillis();
            Person personFor = findNameFor(personsFor, name);
            if (personFor!=null) {
                System.out.print("Find with For in ");
            } else {
                System.out.print("Not found with For in ");
            }
            System.out.println(System.currentTimeMillis() - startTimeHS + "ms");
            System.out.println(personFor);
            System.out.println(DOUBLE_LINE);


            // Run find method with enhanced for
            List<Person> personsEnhancedFor = buildPersons(CANTIDAD);
            long startTimeHSEnhancedFor = System.currentTimeMillis();
            Person personEnhancedFor = findNameEnhancedFor(personsEnhancedFor, name);
            if (personEnhancedFor!=null) {
                System.out.print("Find with Enhanced For in ");
            } else {
                System.out.print("Not found with Enhanced For in ");
            }
            System.out.println(System.currentTimeMillis() - startTimeHSEnhancedFor + "ms");
            System.out.println(personFor);
            System.out.println(DOUBLE_LINE);

            // Run find method with lamda anyMatch
            List<Person> personsLamdaAnyMatch = buildPersons(CANTIDAD);
            //name = personsLamdaAnyMatch.get(personsLamdaAnyMatch.size()-1).getName();
            long startTimeHSLamdaAnyMatch = System.currentTimeMillis();
            boolean foundIt = findNameWithLambdaAnyMatch(personsLamdaAnyMatch, name);
            if (foundIt) {
                System.out.print("Find with lamdaAnyMatch in ");
            } else {
                System.out.print("Not found with lamdaAnyMatch in ");
            }
            System.out.println(System.currentTimeMillis() - startTimeHSLamdaAnyMatch + "ms");
            System.out.println(DOUBLE_LINE);

            // Run find method with lamda
            List<Person> personsLamda = buildPersons(CANTIDAD);
            //name = personsLamda.get(personsLamda.size()-1).getName();
            long startTimeHSLamda = System.currentTimeMillis();
            Person personStream = findNameWithLambda(personsLamda, name);
            if (personStream!=null) {
                System.out.print("Find with lamda in ");
            } else {
                System.out.print("Not found with lamda in ");
            }
            System.out.println(System.currentTimeMillis() - startTimeHSLamda + "ms");
            System.out.println(personStream);
            System.out.println(DOUBLE_LINE);
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

public static Person findNameWhile(List<Person> people, String name){
    Person p;
    int i=0;
    while(i < people.size()){
        p = people.get(i);
        if(p.getName().equals(name)){
            return p;
        }
        i++;
    }
    return null;
}

public static Person findNameFor(List<Person> people, String name) {
    Person p;
    for(int i=0; i < people.size();i++) {
        p = people.get(i);
        if (p.getName().equals(name))
            return p;
    }
    return null;
}

    public static Person findNameEnhancedFor(List<Person> people, String name) {
        for (Person person : people)
            if (person.getName().equals(name))
                return person;

        return null;
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
