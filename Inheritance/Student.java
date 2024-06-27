package Assignment.Inheritance;

public class Student {

  private String name;
  private String subject;
  private int fee;
  private double returnFee;

  public static void main(String args[]) {

    Student stu = new Student("차은우", "jspprogram", 500000);
    stu.calcReturnFee();
    stu.print();
  }

  Student(String name, String subject, int fee) {
    this.name = name;
    this.subject = subject;
    this.fee = fee;
  }

  public void calcReturnFee() {
    if (subject.equals("javaprogram")) {
      returnFee = (double) fee * (double) 25 / 100;
    } else if (subject.equals("jspprogram")) {
      returnFee = (double) fee * (double) 20 / 100;
    }
  }

  public void print() {
    System.out.printf("%s씨의 과정명은 %s이고 교육비는 %d원이며 환급금은 %.0f원 입니다.", name, subject, fee, returnFee);

  }

}