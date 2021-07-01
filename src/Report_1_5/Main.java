package Report_1_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input value of X: ");
        double x = input.nextDouble();

        System.out.println("Logarithm value of X: " + Math.log(x));
        input.close();
    }
}
