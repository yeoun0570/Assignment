package Assignment.Inheritance;

public class Prob1 {

  public static void main(String[] args) {

    Drink coffee = new Drink("커피", 1500, 4);
    Drink tea = new Drink("녹차", 1100, 7);
    Alcohol wine = new Alcohol("와인", 5000, 3, 15.1);

    System.out.println("***** 매 출 전 표 ***** ");
    Drink.printTitle();
    coffee.printData();
    tea.printData();
    System.out.println();

    Alcohol.printTitle();
    wine.printData();

    int sum = coffee.getTotalPrice()
        + tea.getTotalPrice()
        + wine.getTotalPrice();

    System.out.println();
    System.out.println("*** 총금액 " + sum + "원 ***");

  }
}

class Drink {

  Drink(String name, int price, int count) {
    this.name = name;
    this.price = price;
    this.count = count;

  }

  String name;
  int price;
  int count;

  int getTotalPrice() {
    return price * count;
  }

  static void printTitle() {
    System.out.println("상품명\t\t단가\t\t수량\t\t금액");
  }

  void printData() {
    System.out.println(name + "\t\t\t" + price + "\t" + count + "\t\t\t" + getTotalPrice());
  }

}

class Alcohol extends Drink {

  Alcohol(String name, int price, int count, double alcper) {
    super(name, price, count);
    this.alcper = alcper;

  }

  double alcper = 0;

  void resetAlcohol() {
    alcper = 0;
  }

  static void printTitle() {
    System.out.println("상품명(도수[%])\t\t단가\t\t수량\t\t금액");
  }

  void printData() {
    System.out.println(
        name + "(" + alcper + ")" + "\t\t\t\t" + price + "\t" + count + "\t\t\t"
            + getTotalPrice());
  }

}
