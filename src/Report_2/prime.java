package Report_2;

public class prime {
    public static void main(String[] args) {
        // Declare an odd class object

        odd num1 = new odd(15);    // Using constructor
//        odd num1 = new odd();
//        num1.n = 15;

        boolean prime = true;

        // If return 0 then it's EVEN & NOT PRIME
        if (num1.check_odd() == 0) {
            prime = false;
        }
        // If return 1 then check is it PRIME or NOT
        else {
            for (int i = 2; i <= num1.n / 2; i++) {
                if (num1.n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime == false) {
            System.out.println(num1.n + " is NOT PRIME");
        } else {
            System.out.println(num1.n + " is PRIME");
        }
    }
}
