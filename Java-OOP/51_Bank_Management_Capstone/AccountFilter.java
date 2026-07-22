// Functional Interface — Lambda দিয়ে যেকোনো শর্তে account খোঁজার জন্য
// ব্যবহার (BankService-এ তোমাকে লিখতে হবে): service.searchAccounts(a -> a.getBalance() > 1000)
@FunctionalInterface
public interface AccountFilter {
    // @FunctionalInterface annotation বসাও (এই interface-এর ঠিক উপরে)
    // boolean matches(Account account); — এই একটা abstract method লিখো
    boolean matches(Account account);
}
