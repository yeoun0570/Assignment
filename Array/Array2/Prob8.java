package Assignment.Array.Array2;

import java.util.Arrays;
import java.util.Collections;

public class Prob8 {

  public static void main(String[] args) {
    int[][] table = new int[5][5];
    int num1 = 0;
    int num2 = 0;

    for (int i = 0; i < table.length; i++) {

      for (int j = 0; j < table[i].length; j++) {
        ++num1;
      }

      num2 = num1;

      for (int j = 0; j < table[i].length; j++) {
        table[i][j] = num2--;
        System.out.printf("%2d\t\t", table[i][j]);
      }

      System.out.println();
    }
  }

}
