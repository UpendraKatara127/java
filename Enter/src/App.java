public class App {
    public static void main(String[] args) throws Exception {
        BankUser user1 = new BankUser(1234);
        user1.addBalance(1234, 200 );
        user1.removeBalance(1234, 400);
    }
}
