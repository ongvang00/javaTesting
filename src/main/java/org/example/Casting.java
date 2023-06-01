package org.example;

public class Casting {
        public static void main(String[] args) {
            // create double type variable
            double num = 112.35;
            System.out.println("The double value: " + num);

            // convert into int type
            int data = (int)num;
            System.out.println("The integer value: " + data);

            // create string type variable
            String fortynine = "49";
            System.out.println("The string value is: " + fortynine);

            // convert string variable to int
            int number = Integer.parseInt(fortynine);
            System.out.println("The integer value is: " + number);
        }
    }

