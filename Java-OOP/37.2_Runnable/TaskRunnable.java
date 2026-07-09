public class TaskRunnable implements Runnable {
    String name;

    TaskRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + this.name);

    }
}
