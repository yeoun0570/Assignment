package Assignment.Morning_Test.test0627;

import java.util.Scanner;

public class AccountDAO {

  public static Scanner sc = new Scanner(System.in);

  public void printMenu() {
    System.out.println("------------------------------------------------");
    System.out.println("1.계좌생성 | 2.계좌목록 | 3. 예금 | 4.출금 | 5.종료");
    System.out.println("------------------------------------------------");
    System.out.print("선택> ");
  }

  public AccountDTO createAccount() {
    System.out.println("---------");
    System.out.println("계좌생성");
    System.out.println("---------");

    System.out.print("계좌번호: ");
    String accNo = sc.next();

    System.out.print("계좌주: ");
    String name = sc.next();

    System.out.print("초기입금금액: ");
    int money = sc.nextInt();

    AccountDTO accountDTO = new AccountDTO();
    accountDTO.setAccountNumber(accNo);
    accountDTO.setName(name);
    accountDTO.setBalance(money);
    System.out.println("계좌가 생성되었습니다.");
    return accountDTO;
  }

  public void listAccount(AccountDTO[] accounts) {
    System.out.println("---------");
    System.out.println("계좌목록");
    System.out.println("---------");

    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] == null) {
        break;
      }

      System.out.printf("%s\t%s\t%d\n", accounts[i].getAccountNumber(), accounts[i].getName(),
          accounts[i].getBalance());
    }
  }

  public void deposit(AccountDTO[] accounts) {
    System.out.println("---------");
    System.out.println("예금");
    System.out.println("---------");
    System.out.print("계좌번호: ");
    String accountNumber = sc.next();
    System.out.print("예금액: ");
    int money = sc.nextInt();

    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i].getAccountNumber().equals(accountNumber)) {
        accounts[i].addBalance(money);
        System.out.println("성공적으로 입금되었습니다.");
        break;
      } else {
        System.out.println("잘못된 계좌번호입니다.");
      }
    }
  }


  public void withdraw(AccountDTO[] accounts) {
    System.out.println("---------");
    System.out.println("출금");
    System.out.println("---------");
    System.out.print("계좌번호: ");
    String accountNumber = sc.next();
    System.out.print("출금액: ");
    int money = sc.nextInt();

    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i].getAccountNumber().equals(accountNumber)) {
        accounts[i].minusBalance(money);
        System.out.println("성공적으로 출금되었습니다.");
        break;
      } else {
        System.out.println("잘못된 계좌번호입니다.");
      }
    }
  }

}
