package Assignment.Polymorphism.exam2;

public class Rectangular extends Shape {

  private String name = "";
  private double width = 0;
  private String hight = "";

  @Override
  public void calculationArea() {
    area = Double.parseDouble(hight) * width;
  }

  public double getWidth() {
    return this.width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public String getHight() {
    return this.hight;
  }

  public void setHight(String hight) {
    this.hight = hight;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void print() {
    System.out.println(this.name + "의 면적은 " + area);
  }

}
