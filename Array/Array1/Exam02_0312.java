package Assignment.Array.Array1;

public class Exam02_0312 {

  public static void main(String[] args) {

    char[][] alphabet = new char[5][5];
    char start = 'A';

    //1.배열에 알파벳 입력
    //2.원본 배열 출력
    System.out.println("      원본 배열");
    System.out.println("=====================");
    for (int i = 0; i < alphabet.length; i++) {
      for (int j = 0; j < alphabet[i].length; j++) {
        alphabet[i][j] = start;
        System.out.print(alphabet[i][j] + "\t\t");
        start++;
      }
      System.out.println();
    }
    System.out.println();

    //3. 배열 수정
    //4. 수정된 배열 출력
    System.out.println("     수정된 배열");
    System.out.println("=====================");
    start = 'A';
    String str = "*";
    for (int i = 0; i < alphabet.length; i++) {
      for (int j = 0; j < alphabet[i].length; j++) {
        alphabet[i][j] = start;

        if (i == j) {
          alphabet[i][j] = '*';
        }

        System.out.print(alphabet[i][j] + "\t\t");
        start++;
      }
      System.out.println();
    }

    System.out.println();
  }

}



