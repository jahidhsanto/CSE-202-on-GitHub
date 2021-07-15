package Report_3;

public class Add extends Abstract {
    static double total_sum;

    void add(double a, double b) {
        total_sum = a + b;
    }

    void add(double a, double b, double c) {
        total_sum = a + b + c;
    }

    void add(double nxt) {
        total_sum += nxt;
    }
}
