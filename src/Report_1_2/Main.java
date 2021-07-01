package Report_1_2;

public class Main {
    public static void main(String[] args) {
        required_split n = new required_split();

        n.number = 3;

        System.out.println(n.number + " number of cutting required to split a cake into " + n.MaximumPieces() + " pieces");
    }
}
