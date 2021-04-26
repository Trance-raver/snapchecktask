import java.util.*;
import java.lan.*;
import java.io.*;

public class ex {
    public static void main(String[] args) {
        int len, row, col, k = 0;
        char[][] mat;
        double f;
        String res = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your string");
        String s = scan.nextLine();

        s = s.replaceAll(" ", "");

        len = s.length();
        f = Math.sqrt(len);
        row = (int) Math.floor(f);
        col = (int) Math.ceil(f);
        System.out.println("rows" + row + "cols" + col);

        if (row * col < len) {
            if (row < col)
                row++;
            else
                col++;
        }
        mat = new char[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (k >= s.length()) {
                    mat[i][j] = (char) 0;
                } else {
                    mat[i][j] = s.charAt(k++);
                }
            }
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {

                res = res + mat[j][i];
            }

            res = res + " ";
        }

        System.out.println("" + res);
    }
}