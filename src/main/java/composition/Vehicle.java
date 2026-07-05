package composition;

public abstract class Vehicle {
    public FlyInterface flying;

    public void acelerate(){
        System.out.println("Vehicle acelerate !");
    }
    public abstract void brake();

    void setFlyingMode(FlyInterface flying){
       flying.flyingMode();
    }
}
