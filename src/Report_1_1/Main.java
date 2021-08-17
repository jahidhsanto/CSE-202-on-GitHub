package Report_1_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        STUDENT ob = new STUDENT(input.nextInt());
        System.out.println(ob.x);
    }
}
