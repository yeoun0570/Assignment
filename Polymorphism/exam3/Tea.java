package Assignment.Polymorphism.exam3;

public class Tea extends Beverage {

  static int amount;
  String name;

  public Tea() {
  }

  public Tea(String name) {
    this.name = name;
  }

  @Override
  public void calcPrice() {
    if (name.equals("lemonTea")) {
      price = 1500;
      amount++;
    } else if (name.equals("redginsengTea")) {
      price = 2500;
      amount++;
    } else if (name.equals("ginsengTea")) {
      price = 2000;
      amount++;
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


