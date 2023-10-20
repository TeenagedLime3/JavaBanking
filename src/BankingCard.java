import java.util.ArrayList;

public class BankingCard {
    private int balance;
    private ArrayList<String> accountHolderName;

    public BankingCard (int startingBalance, ArrayList<String> accountHolderName){
        this.balance = startingBalance;
        this.accountHolderName = accountHolderName;
    }

    public int getBalance(){
        return this.balance;
    }

    public String displayBalance(){
        return "the user " + accountHolderName.toString() + " has the remaining balance of: " + this.getBalance();
    }

    public void depositMoney (int deposit){
        this.balance += deposit;
    }

    public void withdrawMoney (int withdrawlAmount){
        this.balance -= withdrawlAmount;
    }
}
