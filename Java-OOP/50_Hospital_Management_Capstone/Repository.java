// Generics (standalone) — 49 নাম্বার প্রজেক্টে শুধু List<Book> এর মতো "already বানানো" generic
// class ব্যবহার করা হয়েছিলো (Collection-এর সাথে use), কিন্তু নিজের generic class/method বানানো
// হয়নি। এই ফাঁকটা এখানে পূরণ করো।
//
// T = যেকোনো entity type (Appointment, Patient, Doctor...)
// ID = তার identifier-এর type (এখানে String)
// Spring Data JPA-র Repository<T, ID> interface ঠিক এই pattern-ই follow করে —
// findById(ID id) -> Optional<T>, তাই এটা practice করলে Spring shekhar shomoy shohoj hobe
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
    // public static void printAll(List<? extends Person> people)
    //     — Patient বা Doctor, যেকোনো Person-এর subtype-এর List নিয়ে print করতে পারবে
    //     — "? extends Person" মানে "Person অথবা তার যেকোনো child type"-এর list, upper-bounded wildcard
}
