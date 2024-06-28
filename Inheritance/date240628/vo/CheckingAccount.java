package Assignment.Inheritance.date240628.vo;

public class CheckingAccount extends Account {

  String cardNo;

  public CheckingAccount() {
    super();
  }

  public CheckingAccount(String accId, long balance, String ownerName, String cardNo) {
    super(accId, balance, ownerName);
    this.cardNo = cardNo; //해당 생성자랑 똑같은 형태의 경우에 cardNo가 자기자신의 cardNo라는 것을 this로 표현
  }

  public void pay(String cardNo, long money) {
    if (this.cardNo.equals(cardNo) && money < getBalance()) {
      withdraw(money);
    } else {
      System.out.println("지불이 불가능합니다.");
    }
  }


}
