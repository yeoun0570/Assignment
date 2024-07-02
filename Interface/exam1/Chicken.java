package Assignment.Interface.exam1;

public class Chicken extends Animal implements Cheatable {

  int rememberSpeed;

  Chicken(int speed) {
    super(speed);
  }

  @Override
  void run(int hours) {
    setDitance((double) speed * hours);
    System.out.println("닭의 이동거리=" + getDitance());
    speed = rememberSpeed;
  }

  @Override
  public void fly() {
    int hours = 1;
    rememberSpeed = speed;
    speed = 2 * speed;
  }
}
