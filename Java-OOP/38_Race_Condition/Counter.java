public class Counter {
    int count = 0;

    // increment() মেথড synchronized করো
    synchronized void increment() {
        count++;
    }
}
