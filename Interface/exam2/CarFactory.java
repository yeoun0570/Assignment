package Assignment.Interface.exam2;

public class CarFactory extends Factory implements IWorkingTogether {

  CarFactory() {
  }

  CarFactory(String name, int openHour, int closeHour) {
    super(name, openHour, closeHour);
    this.name = name;
    this.openHour = openHour;
    this.closeHour = closeHour;
  }

  @Override
  int makeProducts(char skill) {
    int result = 0;

    if (skill == 'A') {
      result = 3;
    } else if (skill == 'B') {
      result = 2;
    } else if (skill == 'C') {
      result = 1;
    } else {
      result = 0;
    }
    return result * getWorkingTime();
  }

  @Override
  public int workTogether(IWorkingTogether partner) {
    return makeProducts('B');
  }
}
