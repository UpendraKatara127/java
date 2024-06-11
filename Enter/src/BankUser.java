
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class BankUser {
    private int userID;
    private String userAccount;
    private int userBalance;
    private ArrayList<Transactions> transactions;
    
    public BankUser(int userID){
        this.userID = userID;
        this.userAccount = "User#"+userID;
        this.userBalance = 0;
        transactions = new ArrayList<Transactions>();
    }
    public int get(){
        return this.userID;
    }

    public int getBalance(){
        int balance = this.userBalance;
        return balance;
    }

    public String getAccount(int userID){
        String account = userAccount;
        System.out.println(account);
        return account;
    }

    public boolean  addBalance(int balanceToAdd){
        this.userBalance = this.userBalance + balanceToAdd;
        System.out.println("Successfully added balance to the account.");
        System.out.println(String.format("New Balance : %d", this.userBalance));
        transactions.add(new Transactions("+", balanceToAdd));
        return true;
    }

    public boolean  removeBalance(int balanceToRemove){
        boolean done = false;
        if (balanceToRemove > this.userBalance){ 
            System.err.println("Insufficient Funds");
            System.out.println("Available Funds " + this.userBalance);
            return false; 
        }
        else if (this.userBalance >= balanceToRemove){
            this.userBalance = this.userBalance - balanceToRemove;
            done  = true;
        }
        if (done != false) transactions.add(new Transactions("-", balanceToRemove));
        System.out.println("Successfully removed balance from the account.");
        System.out.println(String.format("New Balance : %d", this.userBalance));
        return done;
    }

    public boolean transferBetweenTwoAccounts(BankUser toUser, int amount) {
        if (this.removeBalance(amount)) {
            toUser.addBalance(amount);
            System.out.println("Successfully transferred " + amount + " to " + toUser.getAccount(amount));
            return true;
        }
        return false;
    }

    public List<String> getTransactionHistory() {
        return transactions.stream()
                           .map(Transactions::toString)
                           .collect(Collectors.toList());
    }

    
}
