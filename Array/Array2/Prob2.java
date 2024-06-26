package Assignment.Array.Array2;

public class Prob2 {

  public static void main(String[] args) {
    Prob2 p2 = new Prob2();
    int[] num = new int[10];
    int max = 0;

    for (int i = 0; i < num.length; i++) {
      num[i] = p2.generateRandom();
      System.out.print(num[i] + " ");
      max = p2.getMaxNum(max, num[i]);
    }
    System.out.println();
    System.out.println("배열에서 가장 큰 숫자 : " + max);

  }

  public int generateRandom() {
    return (int) (Math.random() * 30) + 1;
  }

  public int getMaxNum(int num1, int num2) {
    num1 = Math.max(num1, num2);
    return num1;
  }

}
