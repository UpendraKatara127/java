
public class BankUser {
    private int userID;
    private String userAccount;
    private int userBalance;
    
    public BankUser(int userID){
        this.userID = userID;
        this.userAccount = "User#"+userID;
        this.userBalance = 0;
    }
    public int get(){
        return this.userID;
    }

    public int getBalance(){
        int balance = this.userBalance;
        return balance;
    }

    public void getAccount(int userID){
        String account = userAccount;
        System.out.println(account);
    }

    public boolean  addBalance(int userID, int balanceToAdd){
        this.userBalance = this.userBalance + balanceToAdd;
        System.out.println("Successfully added balance to the account.");
        System.out.println(String.format("New Balance : %d", this.userBalance));
        return true;
    }

    public boolean  removeBalance(int userID, int balanceToRemove){
        if (balanceToRemove > this.userBalance){ 
            System.err.println("Insufficient Funds");
            return false; 
        }
        this.userBalance = this.userBalance - balanceToRemove;
        System.out.println("Successfully removed balance from the account.");
        System.out.println(String.format("New Balance : %d", this.userBalance));
        return true;
    }

}
