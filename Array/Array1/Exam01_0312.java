package Assignment.Array.Array1;

import java.util.Scanner;

public class Exam01_0312 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("배열의 개수를 입력하시오 : ");
    int[] num = new int[sc.nextInt()];
    int total = 0;
    double rate = 0;
    String star = "";

    for (int i = 0; i < num.length; i++) {
      System.out.print("배열에 넣을 값을 입력하시오 : ");
      num[i] = sc.nextInt();
      total += num[i];
    }
    for (int i = 0; i < num.length; i++) {
      rate = (double) num[i] / total * 100;
      for (int j = 0; j < rate; j++) {
        star = "*";
        System.out.print("*");
      }
      System.out.println("(" + rate + "%)");
    }
    
  }

}
