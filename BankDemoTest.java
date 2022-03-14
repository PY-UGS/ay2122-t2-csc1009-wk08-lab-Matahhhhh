import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Desposit Amount in SGD: ");
            double deposit_amt = sc.nextDouble();
            account.deposit(deposit_amt);
            System.out.print("Enter withdrawal amount in SGD: ");
            double withdrawal_amt = sc.nextDouble();
            account.withdraw(withdrawal_amt);
            System.out.print("The balance after withdraw is: $" + account.getBalance());
        } 
        catch(InsufficientFundsException e) {
        System.out.print("Sorry, but your account is short by: $" + (e.getAmount() - account.getBalance()));
        }
    }
}
