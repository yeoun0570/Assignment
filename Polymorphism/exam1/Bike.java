package Assignment.Polymorphism.exam1;

public class Bike extends Wheeler {

  Bike(String carName, int velocity, int wheelNumber) {
    this.carName = carName;
    this.velocity = velocity;
    this.wheelNumber = wheelNumber;
  }

  @Override
  public void speedUp(int speed) {
    velocity = this.velocity + speed;

    if (velocity > 40) {
      velocity = 40;
      System.out.println(this.carName + "의 최고속도위반으로 속도를 " + velocity + "으로 낮춥니다.");
    } else {
      System.out.println(this.carName + "의 현재 속도는 " + velocity + "입니다.");
    }

  }

  @Override
  public void speedDown(int speed) {
    velocity = this.velocity - speed;

    if (velocity < 10) {
      velocity = 10;
      System.out.println(this.carName + "의 최저속도위반으로 속도를 " + velocity + "으로 올립니다.");
    } else {
      System.out.println(this.carName + "의 현재 속도는 " + velocity + "입니다.");
    }

  }

}
