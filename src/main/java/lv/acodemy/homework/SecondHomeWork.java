package lv.acodemy.homework;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.SplittableRandom;

public class SecondHomeWork {
    public static void main(String[] args) {

        // 1 Task
        // 10 European countries

        String[] countries = {"Denmark", "Germany", "Latvia", "Italy", "France", "Spain", "Belgium", "Luxembourg", "Austria", "Netherlands"};
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }

        String[] countriesOfEurope = {"Denmark", "Germany", "Latvia", "Italy", "France", "Spain", "Belgium", "Luxembourg", "Austria", "Netherlands"};
        for (int i = 0; i < countriesOfEurope.length; i++) {
            if (countriesOfEurope[i].equals("Latvia")) {
                System.out.println("Latvia is my motherland");
            }
        }

        // 2 Task
        // Sometimes it pays to stay in bed on Monday, rather than spending the rest of the week debugging Monday’s code.

        String[] arrayWord = {"Sometimes ", "it ", "pays ", "to ", "stay ", "in ", "bed ", "on ", "Monday, ", "rather ", "than ", "spending ", "the ", "rest ", "of ", "the ", "week ", "debugging ", "Monday’s ", "code."};

        for (String text :
                arrayWord) {
            System.out.print(text);
        }

        System.out.println("================================");

        // 3 Task
        //If salary is 5000 = Your salary is low.
        //If salary is between 5000 - 10000 = Your salary is average.
        //If salary is greater 10000 = Your salary is high.

        int salary = 5000;
        if (salary < 5000) {
            System.out.println("Your salary is low.");
        } else if (salary >= 5000 && salary < 10000) {
            System.out.println("Your salary is average.");
        } else if (salary > 10000) {
            System.out.println("Your salary is high.");
        }

        // 4 Task
        //If the number is positive = The number is positive.
        //If the number is negative = The number is negative.
        //If the number is zero = The number is zero.

        int number = 32;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

    }


}
