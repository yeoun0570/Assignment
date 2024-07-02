package Assignment.Polymorphism.exam3;

public class Coffee extends Beverage {

  static int amount;
  String name;

  public Coffee() {
  }

  public Coffee(String name) {
    super(name);
    this.name = name;
  }

  @Override
  public void calcPrice() {
    if (name.equals("Americano")) {
      price = 1500;
      amount++;
    } else if (name.equals("CafeLatte")) {
      price = 2500;
      amount++;
    } else if (name.equals("Cappuccino")) {
      price = 3000;
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
