package Assignment.Polymorphism.exam3;

public abstract class Beverage {

  private String name;
  protected int price;

  public Beverage() {
  }

  public Beverage(String name) {
    this.name = name;
  }

  abstract public void calcPrice();

  public void print() {
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
