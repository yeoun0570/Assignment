package Assignment.Interface.exam1;

public class AnimalTest {

  public static void main(String[] args) {
    Animal dog = new Dog(8);
    Animal chicken = new Chicken(3);
    Chicken cheatableChicken = new Chicken(5);

    System.out.println("1시간 후");
    dog.run(1);
    chicken.run(1);
    checkCheat(cheatableChicken);
    cheatableChicken.run(1);

    System.out.println("2시간 후");
    dog.run(2);
    chicken.run(2);
    checkCheat(cheatableChicken);
    cheatableChicken.run(2);

    System.out.println("3시간 후");
    dog.run(3);
    chicken.run(3);
    checkCheat(cheatableChicken);
    cheatableChicken.run(3);
  }

  public static void checkCheat(Cheatable cheatable) {
    if (cheatable instanceof Chicken chicken) {
      chicken.fly();
    }
  }

}









