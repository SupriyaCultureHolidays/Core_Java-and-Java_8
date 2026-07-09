public class MyThread extends Thread{
    String name;
    
    MyThread(String name){
        this.name = name;
    }

    @Override
    public void run(){
        System.out.println("MyThread Loop start");
        for(int i=0; i<5; i++){
            System.out.println("MyThread : "+i);
        }
    }
}