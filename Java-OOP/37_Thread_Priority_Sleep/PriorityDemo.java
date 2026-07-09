public class PriorityDemo extends Thread {
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}
