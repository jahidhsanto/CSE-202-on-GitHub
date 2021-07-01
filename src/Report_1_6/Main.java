package Report_1_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input value of angle X: ");
        double X = input.nextDouble();

        System.out.println("cos(" + X + ")= " + Math.cos(X));
        System.out.println("sin(" + X + ")= " + Math.sin(X));
    }
}
