package Assignment.Object.String_01;

import java.util.Scanner;

public class Prob2 {

  public static void main(String[] args) {
    String inputStr;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("문자열을 입력하세요. : ");
    inputStr = keyboard.nextLine();

    //프로그램을 구현하세요.
    StringBuilder str = new StringBuilder(inputStr);
    str.reverse();

    char ch;

    for (int i = 0; i < inputStr.length(); i++) {
      ch = str.charAt(i);
      if (ch >= 97 && ch <= 122) {
        ch = (char) (ch - 32);
        System.out.print(ch);
      }
    }
  }

}
