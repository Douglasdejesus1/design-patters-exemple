package composition;

public class HelicopterFly implements FlyInterface {
    @Override
    public void flyingMode() {
        System.out.println("Helicopter is flying in the sky!");
    }
}
