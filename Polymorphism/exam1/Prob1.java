package Assignment.Polymorphism.exam1;

public class Prob1 {

  public static void main(String[] args) {
    Wheeler truck = new Truck("트럭", 100, 4);
    Wheeler bike = new Bike("자전거", 25, 2);

    System.out.println(truck.carName + " : 바퀴 " + truck.wheelNumber + "개입니다");
    System.out.println(bike.carName + " : 바퀴 " + bike.wheelNumber + "개입니다");
    truck.speedUp(0);
    bike.speedUp(0);
    truck.speedDown(20);
    bike.speedDown(20);
    truck.stop();
    bike.stop();
    truck.speedUp(10);


  }
}
