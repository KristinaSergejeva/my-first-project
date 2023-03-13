package lv.acodemy.homework;

import java.util.Arrays;

public class FirstHomeWork {
    public static void main(String[] args) {

        // String
        String name = "Alexey";
        String surName = "Kartynnik";

        // Concatenation
        String fullName = name + " " + surName;
        System.out.println(fullName);

        // char short data type
        char firstInitial = 65;
        System.out.println(firstInitial);

        // char short data type
        char secondInitial = 75;
        System.out.println(secondInitial);

        // String
        String who = "Blogger";
        String nickname = "ITbeard";

        // Concatenation
        String about = who + " " + nickname;
        System.out.println(about);

        // int data type
        int dateOfBirth = 40293;
        System.out.println(dateOfBirth);

        // byte data type
        byte alexCurrentAge = 30;
        System.out.println(alexCurrentAge);

        // byte data type
        byte workExperience = 11;
        System.out.println(workExperience);

        // short data type
        short openYoutubeChannel = 2018;
        System.out.println(openYoutubeChannel);

        // short data type
        short quantityOfVideo = 305;
        System.out.println(quantityOfVideo);

        // long data type
        long subscribersOnYoutube = 318000;
        System.out.println(subscribersOnYoutube);

        // long data type
        long viewsOnYoutube = 23460992;
        System.out.println(viewsOnYoutube);

        // float data type
        float averageVideoTime = 2.50F;
        System.out.println(averageVideoTime);

        // double data type
        double lastVideoTime = 2.27;
        System.out.println(lastVideoTime);

        // boolean is; has;
        boolean isAlexWomen = false;
        boolean isAlexMan = true;
        boolean hasAlexCar = true;

        System.out.printf("%s %s %s\n", isAlexWomen, isAlexMan, hasAlexCar);


        System.out.printf("Alex full name is %s.\n", fullName);
        System.out.printf("Alex date of birth is %s. He is %d years old.\n", dateOfBirth, alexCurrentAge);
        System.out.printf("His work experience in IT is %s years.\n", workExperience);
        System.out.printf("Work as a %s he started at %d.\n", who, openYoutubeChannel);
        System.out.printf("On Youtube Channel he have %s subscribers and %d uploaded video.\n", subscribersOnYoutube, quantityOfVideo);
        System.out.printf("Average of uploaded videos is %s hours.\n", averageVideoTime);
        System.out.printf("The Quantity of views on Alex Youtube Channel is %s.\n", viewsOnYoutube);

        String additionalTask = "Arithmetic operators";
        System.out.println(additionalTask);

        // *
        int a = 250;
        int b = 30;
        int c = a * b;
        System.out.println(c);

        // / division
        double result = (double) a / b;
        System.out.println(result);

        // +, -
        int d = 2458;
        int e = 1865;
        int f = d + e;
        System.out.println(f);
        System.out.println(d - e);

        // %
        int number = 100 % 80;
        System.out.println(number);

        int[] numbers = {10,11,12,13,14,15,16,17,18,19,20};
        System.out.println(Arrays.toString(numbers));

        for(int num : numbers) {
            if(num % 2 == 0) {
                System.out.println("This is even number:" + num);
            }
        }

    }
}
