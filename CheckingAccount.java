public class CheckingAccount {
    private double balance;
    private String account_no;

    public void deposit(double amount) throws IllegalArgumentException{
        if (amount < 0){
            throw new IllegalArgumentException("Deposit value has to be a positive number");
        }
        else{
        this.balance += amount;
        }
    }


    public void withdraw(double amount) throws InsufficientFundsException, IllegalArgumentException{
        if (amount > balance){
            throw new InsufficientFundsException(amount);
        }
        else if (amount < 0){
            throw new IllegalArgumentException("Withdraw value has to be a positive number");
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
