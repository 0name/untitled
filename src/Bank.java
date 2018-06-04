import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bank {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        List<Account> accounts = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            User user = new User();
            users.add(user);
        }

        for (int i=0; i<100; i++){
            Random random = new Random();
            int money = random.nextInt(1000000) + 10000;
            int usr = random.nextInt(100);
            Account account = new Account(users.get(usr), money);
            accounts.add(account);
        }

        for (int j = 0; j<100; j++)
            new Thread() {
                @Override
                public void run() {
                    Random random = new Random();
                    int account1 = random.nextInt(100);
                    int account2 = random.nextInt(100);
                    int money = random.nextInt(1_000_000);
                    transferMoney(accounts.get(account1), accounts.get(account2), money);
                }
            }.start();
    }

    static boolean transferMoney(Account src, Account dst, int amount) {
        int srcTrans = src.getAmount();
        int dstTrans = dst.getAmount();
        srcTrans -= amount;
        dstTrans += amount;


        src.setAmount(srcTrans);
        dst.setAmount(dstTrans);
        return true;
    }
}
