package Homework1;

import java.util.Scanner;

public class EX4_MultiTable {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter an integer number");
        Scanner num = new Scanner(System.in);
        number = num.nextInt();
        System.out.println("Multiplication table of " + number);

        for (int i = 1; i <= 10; i++) System.out.printf("%d * %d = %d \n", number, i, number * i);
    }
}
