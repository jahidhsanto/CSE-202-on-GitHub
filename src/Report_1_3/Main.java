package Report_1_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[8];

        System.out.println("Input 8 digits: ");
        for (int i = 0; i < 8; i++) {
            arr[i] = input.nextInt();
        }

        // Sum of 9digits
        int sum_of_9_digits = (9 * 10) / 2;
        int sum_of_arr = 0;
        for (int x : arr) {
            sum_of_arr += x;
        }

        int missing_9th_digit = sum_of_9_digits - sum_of_arr;
        System.out.println("The missing 9th digit of a suduko grid: " + missing_9th_digit);


    }
}