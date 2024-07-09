package Assignment.Object.objectPractice;

public class Vehicle {

  Owner owner;
  int price;

  @Override
  public boolean equals(Object o) {
    if (owner.equals(o)) {
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    return "소유주정보 : 이름은 " + owner.name + "이고, 핸드폰 번호는 " + owner.cellphone + "입니다.\n"
        + "차량정보 : 가격은 " + price + "입니다.";
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
