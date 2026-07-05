public class Bike implements Vehicle {
    @Override
    public void start(){ 
        System.out.println("Bike Start");
    }
    @Override
    public void stop(){ 
        System.out.println("Bike stop");
    }

    @Override
    public void fuelType(){
        System.out.println("Bike Fuel is 70%");
    }

}
