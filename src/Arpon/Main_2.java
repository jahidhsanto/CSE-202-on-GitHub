package Arpon;

import java.util.Random;
import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int point = 0;

        for (int i = 1; i < 6; i++) {
            System.out.println("========== Round " + i + "==========");
            int sum = random.nextInt(5) + random.nextInt(5);

            Scanner input = new Scanner(System.in);
            int user_input = input.nextInt();

            if (sum == user_input) {
                System.out.println("Answer is correct");
                point++;
            } else
                System.out.println("Answer is incorrect");
        }
        System.out.println("Total score: " + point);
    }
}
