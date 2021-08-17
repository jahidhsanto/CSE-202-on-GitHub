package Lab_manual_3_1;

public class check_leap {
    int year;

    check_leap(int year) {
        this.year = year;
    }

    boolean check() {
        boolean leap = false;

        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
            leap = true;

        return leap;
    }
}
