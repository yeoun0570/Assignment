package Assignment.Class_Practice.Practice02;

public class Student {

  private String name;
  private int age;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private int id;

  public void print(String name, int age, int id) {
    System.out.println("이 름 : " + name + "\t\t나 이 : " + age + "\t\t학 번 : " + id);
  }

}
