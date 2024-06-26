package Assignment.Array.Array2;

import java.util.Scanner;

public class ArrayUtil {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    ArrayUtil arrayUtil = new ArrayUtil();

    char[] s = new char[]{'J', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm'};
    int start = 0;
    int end = 0;

    arrayUtil.reverseString(s, start, end);
  }

  public char[] reverseString(char[] s, int start, int end) {

    //reverseString 메소드 구현
    start = sc.nextInt();
    end = sc.nextInt();

    for (int i = 0; i < s.length; i++) {

      if (i == start) {

        for (int j = end; j >= start; j--) {
          System.out.print(s[j]);
          i = end;
        }

      } else {
        System.out.print(s[i]);
      } //if문 종료

    }//for문 종료

    return s;
  }

}
