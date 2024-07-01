package Assignment.Polymorphism.exam3;

public class Coffee extends Beverage {

  static int amount;
  public String name;

  public Coffee() {
  }

  public Coffee(String name) {
    super(name);
    this.name = name;
  }

  @Override
  public void calcPrice(String name) {
    switch (name) {
      case "Americano" -> price = 1500;
      case "CafeLatte" -> price = 2500;
      case "Cappuccino" -> price = 3000;
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
