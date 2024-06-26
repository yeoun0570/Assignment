package Assignment.Array.Array2;

public class Prob3 {

  public static void main(String[] args) {
    int[] array = {3, 17, 12, 43, 3, 17, 3, 8, 21, 8};
    System.out.println("<< 중복되지 않은 숫자 >>");
    printUniqueNumber(array);
  }

  private static void printUniqueNumber(int[] array) {
    // 구현하세요.
    int num = 0;

    array = new int[]{3, 17, 12, 43, 3, 17, 3, 8, 21, 8};

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        if (array[i] == array[j] && i != j) {
          num = array[i];
        }
      }
      if (num != array[i]) {
        System.out.print(array[i] + " ");
      }
    }


  }

}
