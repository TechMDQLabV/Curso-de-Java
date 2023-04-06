package org.sergiogarguir.optional.ejemplo;

import org.sergiogarguir.optional.ejemplo.models.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Optional;

import static java.util.Optional.ofNullable;

public class EjemploOptional {
    private static final DateTimeFormatter formatterInternationalDateHour = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    private static final DateTimeFormatter formatterInternationalDate = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    private static final DateTimeFormatter formatterLatinDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    private static final String REGEX_LATIN_DATE = "(0[1-9]|[1-2]\\d|3[0-1])(/)(0[1-9]|1[0-2])(/)(\\d{4})";
    public static void main(String[] args) throws ParseException {

        String fecha = "30/02/2020";
        System.out.println("_______"+fecha.matches(REGEX_LATIN_DATE));
        Person person = new Person("Pepe", "Argento");
        person.setDni(14676996);
        person.setBirthDate(fecha);
        System.out.println(person);
        String f = getDateFormat(person.getBirthDate());
        System.out.println("La fecha en string es: " + f);
        ofNullable(person.getBirthDate())
                .ifPresent(birthDate -> {
                    if(birthDate.matches(REGEX_LATIN_DATE)) {
                        System.out.println("Fecha in optional: " + getDateFormat(birthDate));
                    }
                });
        //System.out.println("Fecha: " + getDateFormat(person.getBirthDate()));
        //LocalDate localDate = LocalDate.parse(fecha, formatterLatinDate);

        //System.out.println(localDate.format(formatterInternationalDate));
        String name = "Pepe";
        Optional<String> opt = Optional.of(name);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        if(opt.isPresent()){
            System.out.println("Hola " + opt.get());
        }

        System.out.println(opt.isEmpty());

        opt.ifPresent(valor -> {
            System.out.println("Hola " + valor);
        });
        opt.ifPresent(valor -> System.out.println("Hola " + valor));

        name = "John";
        opt = ofNullable(name);
        System.out.println("opt = " + opt);
        System.out.println("opt.isPresent() = " + opt.isPresent());
        System.out.println("opt.isEmpty() = " + opt.isEmpty());
        
        opt.ifPresent(valor -> System.out.println("valor = " + valor));
        opt.ifPresentOrElse(valor -> System.out.println("valor = " + valor), () -> System.out.println("No está presente o está vacío"));
        if(opt.isPresent()){
            System.out.println("Hola " + opt.get());
        }else{
            System.out.println("No está presente o está vacío");
        }
        
        Optional<String> optEmpty = Optional.empty();
        System.out.println("optEmpty.isPresent() = " + optEmpty.isPresent());


    }

    private static String getDate(){
        return getDateFormat(LocalDateTime.now(), formatterInternationalDateHour);
    }

    private static String getDate(Date date){
        return date != null ? getDateFormat(converteDateToLocalDateTime(date), formatterInternationalDate) : "";
    }

    private static LocalDateTime converteDateToLocalDateTime(Date date){
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }

    private static String getDateFormat(LocalDateTime now, DateTimeFormatter formatterDateHour){
        return now.format(formatterDateHour);
    }

    protected static String getDateFormat(String date) {
        return ofNullable(date)
                .filter(d -> d.matches(REGEX_LATIN_DATE))
                .map(d -> LocalDate.parse(d, formatterLatinDate).format(formatterInternationalDate))
                .orElse("");
    }

    protected <T extends Identifiable,K> T Search(Collection<? extends T> elements, K id){
        T found = null;
        Iterator<? extends T> it = elements.iterator();
        while (it.hasNext() && found == null){
            T current = it.next();
            if(current.sameId(id)){
                found = current;
            }
        }
        return found;
    }
}
