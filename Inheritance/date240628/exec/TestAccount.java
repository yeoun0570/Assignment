package Assignment.Inheritance.date240628.exec;

import Assignment.Inheritance.date240628.vo.CheckingAccount;

public class TestAccount {

  public static void main(String[] args) {
    CheckingAccount acc1 = new CheckingAccount("111-222-333", 1000000, "장동건", "1234-5647-8888");
    acc1.pay("1234-5678-8888", 200000);
    System.out.println("현재잔액====>" + acc1.getBalance());
    acc1.pay("1234-5647-8888", 500000);
    System.out.println("현재잔액====>" + acc1.getBalance());

  }
}
