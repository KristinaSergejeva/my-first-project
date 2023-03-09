package lv.acodemy.classroom;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        /*
        for(int i = 0; i < 10; i++) {
        // define counter;
        // condition
        // increment
         */

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world!");
        }

        //numbers[0] = 1
        //numbers[1] = 2

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        //numbers
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) ;
            {
                System.out.println(numbers[i]);
            }

            System.out.println("=======");

            for (int number : numbers) {
                System.out.println(number);
            }

            // Create String array with 10 names
            // Print all names using for & for each

            String[] names = {"Janis", "Marcis", "Peteris", "Liga", "Livanis"};
            for (int j = 0; j < names.length; j++) {
                if (!names[j].equals("Peteris")) {
                    System.out.println(names[j]);
                }
            }
            System.out.println(Arrays.toString(names));

            System.out.println("==========/=========");

            for (String name : names) {
                System.out.println(name);
            }

            // do, do while

        /*
        do {
        // code to be executed
        }(while is true)
        */

            int k = 0;
            do {
                System.out.println(k);
                k++;
            } while (k <= 10);

            int x = 0;
            while (x <= 10) {
                System.out.println(x);
                x++;
            }

        int[] arrayOfNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] emptyArray = new int[arrayOfNum.length];

        // move numbers from arrayOfNum to emptyArray using loop
        // emptyArray[0] = arrayOfNum[0]

            for (int j = 0; j < arrayOfNum.length; j++) {
                emptyArray[j] = arrayOfNum[j];
            }
                System.out.println(Arrays.toString(emptyArray));
            }




        }


    }

