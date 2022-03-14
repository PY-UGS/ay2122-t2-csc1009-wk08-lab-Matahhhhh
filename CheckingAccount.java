public class CheckingAccount {
    private double balance;
    private String account_no;

    public void deposit(double amount){
        this.balance += amount;
    }


    public void withdraw(double amount) throws InsufficientFundsException{
        if (amount > balance){
            throw new InsufficientFundsException(amount);
        }
        else {
            this.balance -= amount;
        }
    }

    public double getBalance(){
        return this.balance;
    }

    public String getNumber(){
        return this.account_no;
    }
}
