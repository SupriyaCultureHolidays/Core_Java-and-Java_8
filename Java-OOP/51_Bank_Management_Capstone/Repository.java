// Generics (standalone) — নিজের generic class বানানো (49/50-এ যেটা practice করেছিলে সেটাই
// নতুন domain-এ আবার, মুখস্থ পাকা করার জন্য)
//
// T = যেকোনো entity type (Account, TransactionRecord...)
// ID = তার identifier-এর type (এখানে String)
// Spring Data JPA-র JpaRepository<T, ID> interface ঠিক এই pattern-ই follow করে —
// findById(ID id) -> Optional<T>, তাই এটা practice করলে Spring শেখার সময় সহজ হবে
public class Repository<T, ID> {

    // private Map<ID, T> store = new HashMap<>();

    // save(ID id, T item) — store.put(id, item)

    // findById(ID id) — Optional<T> রিটার্ন করো (store.get(id), না পেলে Optional.empty())

    // findAll() — List<T> রিটার্ন করো (store.values() থেকে নতুন List বানিয়ে)

    // deleteById(ID id) — store থেকে remove করো

    // ── Bounded Type Parameter practice ──
    // public static <E extends Comparable<E>> E max(List<E> list)
    //     — list-এর সবচেয়ে বড় element বের করো (Comparable.compareTo() ব্যবহার করে)
    //     — <E extends Comparable<E>> মানে E যেকোনো type হতে পারবে যতক্ষণ সেটা নিজেকে
    //        compare করতে পারে (bounded type)

    // ── Wildcard practice ──
    // public static void printAll(List<? extends Account> accounts)
    //     — SavingsAccount বা CurrentAccount, যেকোনো Account-এর subtype-এর List নিয়ে print করতে পারবে
    //     — "? extends Account" মানে "Account অথবা তার যেকোনো child type"-এর list, upper-bounded wildcard
}
