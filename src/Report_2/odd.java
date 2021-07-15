package Report_2;

public class odd {
    int n;

    // Apply this section for only Constructor
    odd(int num) {
        n = num;
    }

    // By this method check the number is odd or even
    int check_odd() {
        if (n % 2 == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
