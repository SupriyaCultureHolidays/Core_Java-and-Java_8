// Interface (Functional Interface থেকে আলাদা) — এখানে একাধিক method, default method, static method —
// সবকিছু practice করার জায়গা। AccountFilter ছিলো single-method functional interface (lambda-friendly);
// এটা plain interface যেখানে একাধিক method থাকতে পারে।
public interface Auditable {

    // void logAction(String action); — এই abstract method লিখো
    abstract void logAction(String action);

    // default method practice — implementing class override না করলেও এটা কাজ করবে:
    default void logDefaultAction() {
        logAction("Account activity recorded");
    }

    // static method practice — interface-এর মধ্যে static utility method:
    static Auditable consoleAuditor() {
        return action -> System.out.println("Audit: " + action);
    }
}
