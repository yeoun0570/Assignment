package Assignment.Interface.exam1;

public class Dog extends Animal {

  Dog(int speed) {
    super(speed);
  }

  @Override
  void run(int hours) {
    setDitance((double) speed * hours / 2);
    System.out.println("개의 이동거리=" + getDitance());
  }
}
