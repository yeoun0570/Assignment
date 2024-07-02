package Assignment.Polymorphism.exam2;

public class TestShape {

  public static void main(String[] args) {
    Shape[] shape = new Shape[2];

    Circle circle = new Circle();
    Rectangular rectangular = new Rectangular();

    shape[0] = circle;
    shape[1] = rectangular;

    circle.setName("원");
    rectangular.setName("직사각형");

    circle.setRadius(10);
    rectangular.setWidth(20);
    rectangular.setHight("10");

    circle.calculationArea();
    rectangular.calculationArea();

    for (int i = 0; i < shape.length; i++) {
      shape[i].print();
    }


  }
}
