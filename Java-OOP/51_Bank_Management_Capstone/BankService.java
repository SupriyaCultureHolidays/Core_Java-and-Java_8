import java.util.ArrayList;
import java.util.List;

public class BankService {

    // ── Singleton Pattern ──
    private static final BankService instance = new BankService();
    // private constructor + public static BankService getInstance()
    private BankService(){
        System.out.println("BankService Call");
    }
    public static BankService getInstance(){
        return instance;

    }

    // ── ডেটা রাখার জায়গা (Generics + Collection) ──
    private List<Account> accounts = new ArrayList<>();
    private List<TransactionRecord> transactionHistory = new ArrayList<>();
    //
    // চাইলে raw List-এর বদলে নিজের বানানো generic Repository<Account, String>
    // ব্যবহার করতে পারো (দেখো Repository.java)

    // ── Set/Map practice ──
    // private Set<String> branchCodes = new HashSet<>();
    // — addAccount()-এ account-এর branch code (থাকলে) add করো, duplicate থাকবে না (Set-এর বৈশিষ্ট্য)
    // private Map<String, List<TransactionRecord>> transactionsByAccount = new HashMap<>();
    // — accountNumber অনুযায়ী transaction group করে রাখার জন্য

    // ── মূল Method গুলো ──

    // addAccount(Account account) — accounts list-এ add করো

    // deposit(String accountNumber, double amount) throws AccountNotFoundException
    // — accountNumber দিয়ে account খুঁজে বের করো (না পেলে exception), account.deposit(amount)
    //   call করো, TransactionRecord (DEPOSIT) history-তে add করো

    // @Loggable(action = "WITHDRAW") — এই annotation টা withdraw()-এর উপর বসাও
    // (পরে Demo-তে reflection দিয়ে পড়ে দেখাবে কোন method-এ Loggable আছে)
    // withdraw(String accountNumber, double amount)
    //     throws AccountNotFoundException, InsufficientFundsException
    // — account না পেলে AccountNotFoundException
    // — যথেষ্ট balance না থাকলে (CurrentAccount হলে overdraftLimit বিবেচনা করে) InsufficientFundsException
    // — নাহলে account.withdraw(amount) call করো, TransactionRecord (WITHDRAW) add করো
    // — Threads bonus (ConcurrentWithdrawalDemo.java দেখো): দুইটা Thread একসাথে call করলে
    //   race condition হতে পারে, তাই method-এর signature-এ "synchronized" keyword যোগ করার
    //   কথা ভাবো

    // @Loggable(action = "TRANSFER")
    // transfer(String fromAccountNumber, String toAccountNumber, double amount)
    //     throws AccountNotFoundException, InsufficientFundsException
    // — ভিতরে withdraw(fromAccountNumber, amount) + deposit(toAccountNumber, amount) call করলেই হবে
    // — TransactionRecord-এ TRANSFER_OUT (from) আর TRANSFER_IN (to) দুইটাই log করো

    // searchAccounts(AccountFilter criteria) — Stream + Lambda দিয়ে filter করো, List<Account> রিটার্ন করবে

    // findAccountByNumber(String accountNumber) — Optional<Account> রিটার্ন করবে (পাওয়া না গেলে Optional.empty())

    // displayAllAccounts() — Comparator ব্যবহার করে balance অনুযায়ী sort করে print করো
    // — বোনাস: বড় list হলে .parallelStream() দিয়েও চেষ্টা করে দেখতে পারো, তবে ছোট list-এ
    //   এটা লাভজনক না, বরং overhead বাড়ায় — কখন ব্যবহার করা উচিত সেটা বোঝাই আসল লক্ষ্য

    // ── Bonus: Static Nested Class ──
    // Stats নামে static nested class বানাও — totalAccounts ও totalBalance ধরে রাখবে
    // getStats() method দিয়ে এই Stats-এর object রিটার্ন করো
}
