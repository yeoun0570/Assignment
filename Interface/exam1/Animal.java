package Assignment.Interface.exam1;

public abstract class Animal {

  int speed;
  private double distance;

  Animal(int speed) {
    this.speed = speed;
  }

  abstract void run(int hours);

  public double getDitance() {
    return this.distance;
  }

  public void setDitance(double distance) {
    this.distance = distance;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }
}
