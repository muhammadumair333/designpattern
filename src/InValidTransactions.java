import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InValidTransactions {

    public static void main(String[] args) {
        String[] transactions = {"alice,20,800,mtv","bob,50,1200,mtv"};
        List<String> invalid = invalidTransactions(transactions);
        System.out.println(invalid);
    }

    public static List<String> invalidTransactions(String[] transactions) {
        HashMap<String, List<Transaction>> map = new HashMap<>();
        List<String> invalid = new ArrayList<>();

        for (String transaction : transactions) {
            Transaction t = new Transaction(transaction);
            if (map.containsKey(t.name)) {
                map.get(t.name).add(t);
            } else {
                List<Transaction> list = new ArrayList<>();
                list.add(t);
                map.put(t.name, list);
            }
        }

        for (String transaction : transactions) {
            Transaction currentTransaction = new Transaction(transaction);
            List<Transaction> transactionList = map.get(currentTransaction.name);
            boolean result = isValidTransaction(currentTransaction, transactionList);
            if (!result)
                invalid.add(transaction);
        }
        return invalid;
    }

    static boolean isValidTransaction(Transaction currentTransaction, List<Transaction> transactions) {

        for (Transaction trans : transactions) {
            long time = (Math.abs(currentTransaction.time - trans.time));
            if (((time <= 60) && !currentTransaction.city.equals(trans.city)) || currentTransaction.amount > 1000) {
                return false;
            }
        }
        return true;
    }

}

class Transaction {
    String name;
    int time;
    int amount;
    String city;

    Transaction(String transaction) {
        String[] singleTransaction = transaction.split(",");
        this.name = singleTransaction[0];
        this.time = Integer.parseInt(singleTransaction[1]);
        this.amount = Integer.parseInt(singleTransaction[2]);
        this.city = singleTransaction[3];
    }
}
