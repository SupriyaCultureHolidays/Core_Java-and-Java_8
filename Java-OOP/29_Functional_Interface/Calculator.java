@FunctionalInterface
public interface Calculator {
    public abstract int operate(int a, int b);
    int a = 5;
    default void display(){
        System.out.println("Display");
    }
    public abstract void add(int a, int b);
}
