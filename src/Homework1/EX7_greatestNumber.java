package Homework1;

import java.util.Scanner;

public class EX7_greatestNumber {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Input first number: ");
        float n1 = numbers.nextInt();
        System.out.println("Input second number: ");
        float n2 = numbers.nextInt();
        System.out.println("Input 3th number: ");
        float n3 = numbers.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            System.out.println(n1 + " is the greatest number.");
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println(n2 + " is the greatest number.");
        } else
            System.out.println(n3 + " is the greatest number.");
    }
}

