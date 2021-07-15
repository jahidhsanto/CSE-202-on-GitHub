package Report_1_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input value of X+Y: ");
        int a = input.nextInt();

        System.out.println("Input value of X~Y: ");
        int b = input.nextInt();

        int X = (a + b) / 2;
        int Y = a - X;

        System.out.println("Value of X : " + X);
        System.out.println("Balue of Y : " + Y);
    }
}
