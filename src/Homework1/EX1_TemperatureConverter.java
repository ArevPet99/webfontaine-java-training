package Homework1;

import java.util.Scanner;

public class EX1_TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a degree in Fahrenheit:  ");
        float input = scanner.nextInt();
        float result = (input - 32) * 5 / 9;
        System.out.println(input + " degree Fahrenheit is equal to " + result + " in Celsius");
    }
}