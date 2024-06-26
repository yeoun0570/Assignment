package Assignment.Array.Array2;

public class ArrayCompare {

  public static void main(String[] args) {
    int[] arr1 = {2, 5, 6, 9, 10, 2, 7};
    int[] arr2 = {3, 5, 6, 9, 10, 2, 7};

    if (equalsArr1(arr1, arr2)) {
      System.out.println("two array equals");
    } else {
      System.out.println("two array not-equals");
    }

    System.out.println("=====================");

    int[] arr3 = {3, 5, 6, 9};
    int[] arr4 = {3, 5, 6, 9, 8};
    if (equalsArr2(arr3, arr4)) {
      System.out.println("two array equals");
    } else {
      System.out.println("two array not-equals");
    }
  }

  private static boolean equalsArr1(int[] arr1, int[] arr2) {

    /*  이곳에 프로그램을 완성하십시오. */
    //내용비교 -  for문
    boolean equalsArr = true;

    for (int i = 0; i < arr1.length; i++) {

      if (arr1[i] == arr2[i]) {
        equalsArr = true;
      } else {
        equalsArr = false;
        break;
      }

    } //for문 종료

    return equalsArr;
  }

  private static boolean equalsArr2(int[] arr3, int[] arr4) {

    /*  이곳에 프로그램을 완성하십시오. */
    //길이 비교
    boolean equalsArr;
    equalsArr = (arr3.length == arr4.length) ? true : false;
    return equalsArr;
  }

}
