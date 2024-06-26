package Assignment.Array.Array2;

import java.util.Arrays;

public class Prob6 {

  public static void main(String[] args) {
    Prob6 median = new Prob6();

    int[] values1 = {10, 4, 53, 63, 17, 37, 52, 16, 33, 65};
    System.out.println("input : " + Arrays.toString(values1));
    System.out.println("median : " + median.findMedian(values1));
    System.out.println("=================================================");

    int[] values2 = {32, 53, 52, 76, 15, 98, 76, 65, 36, 10};
    System.out.println("input : " + Arrays.toString(values2));
    System.out.println("median : " + median.findMedian(values2));
  }

  public int findMedian(int[] values) {

    // 메소드를 완성하세요
    int sum = 0;
    double avg = 0;
    int divide = 0;
    int target = 0;
    int near = 0;
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < values.length; i++) {
      sum += values[i];
      divide++;
      avg = (double) sum / divide;
    } //for문 종료

    for (int i = 0; i < values.length; i++) {
      target = (int) Math.abs(values[i] - avg);

      if (min > target) {
        min = target;
        near = values[i];
      }

    } //for문 종료
    return near;

  }

}
