
import java.util.Comparator;

class BankUserComparator implements Comparator<BankUser>{

    @Override
    public int compare(BankUser o1, BankUser o2) {
        // TODO Auto-generated method stub
        return Integer.compare(o1.getBalance(), o2.getBalance());
    }
    
}

