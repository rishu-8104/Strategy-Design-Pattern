public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyWithWings(); // Set the fly behavior for RubberDuck
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck");
    }

    // Other methods...
}
