package Assignment.Array.Array2;

public class Prob5 {

  public static int getValue(int[] values, boolean isMax) {

    // int 타입 배열의 최대값 또는 최소값을 리턴한다.
    values = new int[]{57, 3, 43, 5, 39, 23, 55, 2};
    int value = 2;

    for (int i = 0; i < values.length; i++) {
      if (isMax == true) {
        value = Math.max(value, values[i]);
      } else {
        value = Math.min(value, values[i]);
      }
    }
    return value;
  }

  public static void main(String[] args) {
    int[] values = {57, 3, 43, 5, 39, 23, 55, 2};

    int maxValue = getValue(values, true);
    int minValue = getValue(values, false);

    System.out.println("최대값 = " + maxValue);
    System.out.println("최소값 = " + minValue);

  }

}
