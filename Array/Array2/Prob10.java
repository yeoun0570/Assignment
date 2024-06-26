package Assignment.Array.Array2;

public class Prob10 {

  public static void main(String[] args) {

    int a[][] = {{30, 30, 30, 30}, {40, 40, 40, 40}, {50, 50, 50, 50}};
    int b[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    int c[][] = new int[3][4];

    Prob10 pb = new Prob10();
    pb.sub(a, b, c);
    pb.prn(c);

  }

  public int[][] sub(int[][] a, int[][] b, int[][] c) {

    /* 이곳에 프로그램을 완성하십시오. */
    int[][] sub = new int[3][4];

    for (int i = 0; i < sub.length; i++) {

      for (int j = 0; j < sub[i].length; j++) {
        c[i][j] = a[i][j] - b[i][j];
      }


    } // for문 종료
    return sub;

  }

  public void prn(int[][] c) {

    /* 이곳에 프로그램을 완성하십시오. */
    int[][] prn = new int[3][4];

    for (int i = 0; i < prn.length; i++) {

      for (int j = 0; j < prn[i].length; j++) {
        System.out.printf("%d ", c[i][j]);
      }
      System.out.println();
    }

  }

}
