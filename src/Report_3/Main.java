package Report_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers do you want to add?\t");
        int n = input.nextInt();

        // Run this loop while user inputs less than 2
        while (n < 2) {
            System.out.print("Wrong Input!!! Please input again(Minimum number 2): ");
            n = input.nextInt();
        }

        System.out.print("Input 1st number: ");
        double a = input.nextDouble();
        System.out.print("Input 2nd number: ");
        double b = input.nextDouble();

        Add sum = new Add();

        if (n == 2) {
            sum.add(a, b);
        } else if (n == 3) {
            System.out.print("Input 3rd number: ");
            double c = input.nextDouble();
            sum.add(a, b, c);
        } else {
            Add.total_sum = a + b;

            for (int i = 2; i < n; i++) {
                System.out.print("Input " + (i + 1) + "th number: ");
                sum.add(input.nextDouble());
            }
        }
        System.out.println("Summation of " + n + " numbers: " + Add.total_sum);
    }
}
