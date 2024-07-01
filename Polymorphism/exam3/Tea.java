package Assignment.Polymorphism.exam3;

public class Tea extends Beverage {

  static int amount;
  public String name;
  int price;

  public Tea() {
  }

  public Tea(String name) {
    super(name);
    this.name = name;
  }

  @Override
  public void calcPrice(String name) {
    switch (name) {
      case "lemonTea" -> price = 1500;
      case "redginsengTea" -> price = 2500;
      case "ginsengTea" -> price = 2000;
      default -> {
        return;
      }
    }
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }
}
