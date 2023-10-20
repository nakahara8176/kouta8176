import java.util.Scanner;

public class ATM {
    private double balance;

    public ATM() {
        balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("預金が成功しました。新しい残高: " + balance);
        } else {
            System.out.println("無効な金額です。");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("引き出しが成功しました。新しい残高: " + balance);
        } else {
            System.out.println("無効な金額または残高不足です。");
        }
    }

    public void checkBalance() {
        System.out.println("現在の残高: " + balance);
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 預金");
            System.out.println("2. 引き出し");
            System.out.println("3. 残高照会");
            System.out.println("4. 終了");
            System.out.print("操作を選んでください: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("預金額を入力してください: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("引き出し額を入力してください: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("アプリケーションを終了します。");
                    System.exit(0);
                default:
                    System.out.println("無効な選択です。もう一度選んでください。");
            }
        }
    }
}