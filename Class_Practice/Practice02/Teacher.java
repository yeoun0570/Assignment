package Assignment.Class_Practice.Practice02;

public class Teacher {

  private String name;
  private int age;

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
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

  private String subject;

  public void print(String name, int age, String subject) {
    System.out.println("이 름 : " + name + "\t\t나 이 : " + age + "\t\t담당과목 : " + subject);
  }

}
