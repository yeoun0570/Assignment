package Assignment.Class_Practice.Practice03;

public class Emp {

  //사원번호 : id 사원 이름 : name 사원의 기본급 : baseSalary(정수)
  private String id;
  private String name;
  private int baseSalary;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBaseSalary() {
    return baseSalary;
  }

  public void setBaseSalary(int baseSalary) {
    this.baseSalary = baseSalary;
  }

  //
  public double getSalary(double bonus) {
    return baseSalary + baseSalary * bonus;
  }

  public String toString() {
    return name + "(" + id + ")" + " 사원의 기본급은 " + baseSalary + "원 입니다.";
  }


}
