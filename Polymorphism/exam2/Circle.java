package Assignment.Polymorphism.exam2;

public class Circle extends Shape {

  private String name;
  private double radius = 0;

  @Override
  public void calculationArea() {
    area = radius * radius * Math.PI;
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  public void print() {
    System.out.println(this.name + "의 면적은 " + area);
  }

}
