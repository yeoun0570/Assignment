package Assignment.Array.Array2;

import java.util.Arrays;

public class SortUtil {

  public static void main(String[] args) {
    SortUtil sortUtil = new SortUtil();
    int[] inputNumbers = new int[]{7, 5, 2, 19, 34, 51, 32, 11, 67, 21};

    sortUtil.ascending(inputNumbers);
  }

  public int[] ascending(int[] inputNumbers) {
    // 오름차순 메소드를 구현하시오

    Arrays.sort(inputNumbers);
    for (Integer i : inputNumbers) {
      System.out.print(i + " ");
    }
    return inputNumbers;
  }

}
