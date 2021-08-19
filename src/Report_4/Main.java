package Report_4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // Decide file directory
        String dir = "D:\\GUB\\5th Semester\\CSE 202\\LAB Report\\CSE-202-on-GitHub\\src\\Report_4";
        String in_1_filename = "input_1.txt";   // This file is for input data
        String in_2_filename = "input_2.txt";   // This file is for input data
        String out_filename = "output.txt";     // This file is for output data

        File in_1_file = new File(dir, in_1_filename);
        File in_2_file = new File(dir, in_2_filename);
        File out_file = new File(dir, out_filename);

        in_1_file.createNewFile();
        in_2_file.createNewFile();
        out_file.createNewFile();

        FileReader fr_1 = new FileReader(in_1_file);
        FileReader fr_2 = new FileReader(in_2_file);
        FileWriter fw = new FileWriter(out_file);

        Scanner input_1 = new Scanner(fr_1);
        Scanner input_2 = new Scanner(fr_2);

        //creating two matrices
        int[][] a = new int[3][3];  //3 rows and 3 columns
        int[][] b = new int[3][3];  //3 rows and 3 columns
        int[][] c = new int[3][3];  //3 rows and 3 columns

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = input_1.nextInt();
                b[i][j] = input_2.nextInt();
            }
        }
        fr_1.close();
        fr_2.close();

        //multiplying and printing multiplication of 2 matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }//end of k loop
                System.out.print(c[i][j] + " ");  //printing matrix element
                fw.write(c[i][j] + " ");
            }//end of j loop
            System.out.println();//new line
            fw.write("\n");
        }
        fw.close();
    }
}