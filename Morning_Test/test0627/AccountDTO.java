package Assignment.Morning_Test.test0627;

public class AccountDTO {

  public String accountNumber;
  public String name;
  public int balance;

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public void addBalance(int money) {
    this.balance += money;
  }

  public void minusBalance(int money) {
    this.balance -= money;
  }

}
