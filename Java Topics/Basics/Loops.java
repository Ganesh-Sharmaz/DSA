package Basics;

import java.util.Scanner;

public class Loops {

    public static void ConvertTemperature(float tempC){
        float tempF = (tempC * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + tempF + " F ");
    }

    public static void main(String[] args) {
        if (true) {
            System.out.println("Printing only if true");
        }
        if (false) {
            System.out.println("Not printing because condition is not true");
        }

        // while loop
        // while (condition) { body + termination condition }
        // in this we don't know how many times the loop will run
        int count = 1;
        while (count != 5) {
            System.out.println(count);
            count++;
        }

        // for loop
        // for (variable starting value; termination condition; increment or decrement){ body of the for loop }
        // in this we know how many times the loop will run
        for (int i = 0; i<=10; i++) {
            System.out.println(i);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius: ");
        float tempC = sc.nextFloat();

        ConvertTemperature(tempC);
    }
}
