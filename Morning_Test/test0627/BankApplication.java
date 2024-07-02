package Assignment.Morning_Test.test0627;

import java.util.Scanner;

public class BankApplication {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    AccountDAO accountDAO = new AccountDAO();
    AccountDTO[] accountDTOS = new AccountDTO[100];

    int select = 0;

    for (int i = 0; i < accountDTOS.length; i++) {
      accountDAO.printMenu();
      select = sc.nextInt();

      if (select == 1) {
        for (int j = 0; j < accountDTOS.length; j++) {
          if (accountDTOS[j] == null) {
            accountDTOS[j] = accountDAO.createAccount();
            break;
          }
        }
      } else if (select == 2) {
        accountDAO.listAccount(accountDTOS);
      } else if (select == 3) {
        accountDAO.deposit(accountDTOS);
      } else if (select == 4) {
        accountDAO.withdraw(accountDTOS);
      } else if (select == 5) {
        System.out.println("프로그램 종료");
        break;
      } else {
        System.out.println("없는 메뉴입니다. 다시 선택해주세요.");
      }
    }

  }

}
