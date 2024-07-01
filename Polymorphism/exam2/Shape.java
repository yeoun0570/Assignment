package Assignment.Polymorphism.exam2;

public abstract class Shape {

  protected double area;
  private String name = "";

  public Shape() {
  } //디폴트 생성자

  public Shape(String name) {
  }

  abstract public void calculationArea();

  public void print() {
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    name = this.name;
  }

}
