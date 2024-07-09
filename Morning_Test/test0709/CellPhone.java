package Assignment.Morning_Test.test0709;

public class CellPhone {

  String model;
  double battery;

  CellPhone() {
  }

  CellPhone(String model) {
    this.model = model;
  }

  void call(int time) throws IllegalArgumentException {

    try {
      if (time >= 0) {
        battery = battery - (time * 0.5);
        if (battery <= 0) {
          battery = 0;
        }
        System.out.println("통화 시간 : " + time + "분");
      } else {
        throw new IllegalArgumentException();
      }
    } catch (IllegalArgumentException e) {
      System.err.println("통화시간입력오류");
    }

  }


  void charge(int time) {

    try {
      if (time >= 0) {
        battery = time * 3;
        if (battery >= 100) {
          battery = 100;
        }
        System.out.println("충전 시간 : " + time + "분");
      } else {
        throw new IllegalArgumentException();
      }
    } catch (IllegalArgumentException e) {
      System.err.println("충전시간입력오류");
    }
  }

  void printBattery() {
    System.out.println("남은 배터리 양 : " + battery);
  }

}
