package Assignment.Array.Array2;

public class Prob9 {

  public static void main(String[] args) {
    Prob9 prob9 = new Prob9();

    char[][] alphabet = new char[5][5];

    prob9.alphabetStar(alphabet);

  }

  public char[][] alphabetStar(char[][] alphabet) {

    char start = 'A';
    //1.배열에 알파벳 입력
    //2.원본 배열 출력
    System.out.println("      원본 배열");
    System.out.println("===================");
    for (int i = 0; i < alphabet.length; i++) {

      for (int j = 0; j < alphabet[i].length; j++) {
        alphabet[i][j] = start++;
        System.out.print(alphabet[i][j] + "\t\t");
      }
      System.out.println();

    }

    System.out.println("     수정된 배열");
    System.out.println("===================");
    //3. 배열 수정
    //4. 수정된 배열 출력
    start = 'A';
    for (int i = 0; i < alphabet.length; i++) {

      for (int j = 0; j < alphabet[i].length; j++) {
        if (i == j) {
          alphabet[i][j] = '*';
        } else {
          alphabet[i][j] = start++;
        }
        System.out.print(alphabet[i][j] + "\t\t");

      }
      System.out.println();

    }

    return alphabet;

  }

}
