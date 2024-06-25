package Assignment.Array.Array_basic;

import java.util.Random;

public class ArrayExam02 {

  public static void main(String[] args) {

    int[] num = new int[5];
    Random random = new Random();

    for (int i = 0; i < num.length; i++) {
      int randomNum = random.nextInt(100) + 1;
      num[i] = randomNum;
      System.out.print(num[i] + " ");
    }

  }
}