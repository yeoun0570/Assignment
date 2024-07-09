package Assignment.Object.objectPractice;

public class Owner {

  String name;
  String cellphone;

  public Owner(String name, String cellphone) {
    this.name = name;
    this.cellphone = cellphone;
  }

  @Override
  public boolean equals(Object o) {
    if (name.equals(o)) {
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    return "이름은 " + name + "이고, 핸드폰 번호는 " + cellphone + "입니다.";
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCellphone(String cellphone) {
    this.cellphone = cellphone;
  }
}
