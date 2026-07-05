package composition;

public class Helicopter extends Vehicle {
    public Helicopter() {
        flying = new HelicopterFly();
    }

    @Override
    public void brake() {
        System.out.println("Helicopter doesn't braking!");
    }

    public static void main(String[] args) {
        Helicopter airplane = new Helicopter();
        airplane.acelerate();
        airplane.brake();
        airplane.setFlyingMode(airplane.flying);
    }
}
