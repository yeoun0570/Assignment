package Assignment.Class_Practice.Practice03;

public class Account {

  //계좌번호
  private String accNo;
  //잔고
  private int balance;

  public String getAccNo() {
    return accNo;
  }

  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  //입금
  public String save(int plusMoney) {
    balance = balance + plusMoney;
    String save = accNo + "계좌에 " + plusMoney + "만원이 입금되었습니다.";
    System.out.println(save);
    return save;
  }

  //출금
  public String deposit(int minusMoney) {
    String deposit = "";
    balance = balance - minusMoney;
    if (balance < 0) {
      deposit = "잔고가 부족하여 출금이 불가능합니다. 남은 잔고를 확인해주세요.";
      System.out.println(deposit);
    } else {
      deposit = accNo + "계좌에 " + minusMoney + "만원이 출금되었습니다.";
      System.out.println(deposit);
      System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원입니다.");
    }
    return deposit;
  }

}


