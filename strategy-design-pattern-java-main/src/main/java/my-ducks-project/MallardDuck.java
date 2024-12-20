public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings(); // Set the fly behavior for MallardDuck
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

    // Other methods...
}