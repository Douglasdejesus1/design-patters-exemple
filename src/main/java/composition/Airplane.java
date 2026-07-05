package composition;

public class Airplane extends Vehicle {
    public Airplane() {
        flying = new AirplaneFly();
    }

    @Override
    public void brake() {
        System.out.println("Airplane doesn't braking!");
    }

    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        airplane.acelerate();
        airplane.brake();
        airplane.setFlyingMode(airplane.flying);
    }
}
