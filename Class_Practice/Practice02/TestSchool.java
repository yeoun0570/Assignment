package Assignment.Class_Practice.Practice02;

public class TestSchool {

  public static void main(String[] args) {

    Student s = new Student();
    s.setName("홍길동");
    s.setAge(20);
    s.setId(200201);
    Teacher t = new Teacher();
    t.setName("홍길동");
    t.setAge(30);
    t.setSubject("JAVA");
    Employee e = new Employee();
    e.setName("홍길동");
    e.setAge(40);
    e.setDept("교무과");

    s.print(s.getName(), s.getAge(), s.getId());
    t.print(t.getName(), t.getAge(), t.getSubject());
    e.print(e.getName(), e.getAge(), e.getDept());
  }

}
