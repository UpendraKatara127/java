
import java.util.Comparator;

class BankUserComparator implements Comparator<BankUser>{

    @Override
    public int compare(BankUser o1, BankUser o2) {
        return Integer.compare(o1.getBalance(), o2.getBalance());
    }
    
}

