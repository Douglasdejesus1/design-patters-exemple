package composition;

public class AirplaneFly implements FlyInterface {
    @Override
    public void flyingMode() {
        System.out.println("Airplane is flying in the sky!");
    }
}
