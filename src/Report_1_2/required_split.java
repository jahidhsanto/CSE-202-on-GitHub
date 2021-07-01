package Report_1_2;

public class required_split {
    int number;

    int MaximumPieces() {
        int x = number / 2;
        return ((x + 1) * (number - x + 1));
    }
}
