package org.sergiogarguir.lambda;

import org.sergiogarguir.lambda.models.User;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {

        Predicate<Integer> test1 = num -> num > 10;
        boolean r = test1.test(7);
        System.out.println("r = " + r);

        Predicate<String> test2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(test2.test("ROOLE_ADMIN"));

        BiPredicate<String, String> test3 = (a, b) -> a.equals(b);
        System.out.println("test3.test3(\"Nico\", \"Nico\") = " + test3.test("Nico", "Nico"));

        BiPredicate<Integer, Integer> test4 = (i, j) -> j > i;
        System.out.println("test4.test(5, 50) = " + test4.test(5, 50));

        User a = new User();
        User b = new User();
        a.setName("juana");
        b.setName("maria");

        BiPredicate<User, User> text5 = (ua, ub) -> ua.getName().equals(ub.getName());
        System.out.println("text5.test(a, b) = " + text5.test(a, b));

    }
}
