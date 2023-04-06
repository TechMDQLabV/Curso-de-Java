package org.sergiogarguir.java8.lambda;

import org.sergiogarguir.java8.lambda.models.User;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {

        Predicate<Integer> test = num -> num > 10;
        boolean r = test.test(7);
        System.out.println("r = " + r);

        Predicate<String> test2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(test2.test("ROLE_ADMIN"));

        //BiPredicate<String, String> test3 = (a, b) -> a.equals(b);
        BiPredicate<String, String> test3 = String::equals;

        System.out.println(test3.test("pepe","pepe"));

        BiPredicate<Integer, Integer> test4 = (i, j) -> j > i;
        System.out.println(test4.test(2,3));

        Usuario a = new Usuario();
        Usuario b = new Usuario();
        a.setName("maria");
        b.setName("maria");
        BiPredicate<Usuario, Usuario> test5 = (ua, ub) -> ua.getName().equals(ub.getName());
        System.out.println(test5.test(a,b));

    }
}
