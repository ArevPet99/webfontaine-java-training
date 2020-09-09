package Homework1;

import java.util.Scanner;

public class EX2_InchTOMetersConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a value for inch:  ");
        double inputInch = scanner.nextInt();
        double resultInmeters = inputInch * 0.0254;
        System.out.println(inputInch + " inch is " + resultInmeters + " meters");
    }
}
