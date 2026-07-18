// Generics (standalone) — 49 নাম্বার প্রজেক্টে শুধু List<Book> এর মতো "already বানানো" generic
// class ব্যবহার করা হয়েছিলো (Collection-এর সাথে use), কিন্তু নিজের generic class/method বানানো
// হয়নি। এই ফাঁকটা এখানে পূরণ করো।
//
// T = যেকোনো entity type (Appointment, Patient, Doctor...)
// ID = তার identifier-এর type (এখানে String)
// Spring Data JPA-র Repository<T, ID> interface ঠিক এই pattern-ই follow করে —
// findById(ID id) -> Optional<T>, তাই এটা practice করলে Spring shekhar shomoy shohoj hobe
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Repository<T, ID> {

    private Map<ID, T> store = new HashMap<>();

    void save(ID id, T item) {
        store.put(id, item);
    }

    Optional<T> findById(ID id) {
        return Optional.ofNullable(store.get(id));
    }

    List<T> findAll() {
        return new ArrayList<>(store.values());
    }

    void deleteById(ID id) {
        store.remove(id);
    }

    // ── Bounded Type Parameter practice ──
    // <E extends Comparable<E>> মানে E যেকোনো type হতে পারবে যতক্ষণ সেটা নিজেকে
    // compare করতে পারে (bounded type)
    public static <E extends Comparable<E>> E max(List<E> list) {
        E result = list.get(0);
        for (E item : list) {
            if (item.compareTo(result) > 0) {
                result = item;
            }
        }
        return result;
    }

    // ── Wildcard practice ──
    // "? extends Person" মানে "Person অথবা তার যেকোনো child type"-এর list, upper-bounded wildcard
    public static void printAll(List<? extends Person> people) {
        for (Person p : people) {
            System.out.println(p.getRole() + ": " + p.name);
        }
    }
}
