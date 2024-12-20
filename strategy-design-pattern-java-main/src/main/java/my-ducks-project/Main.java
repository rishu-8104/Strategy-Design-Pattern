
public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redhead = new RedheadDuck();
        Duck rubberDuck = new RubberDuck();

        mallard.performFly(); // Mallard duck flies with wings
        redhead.performFly(); // Redhead duck flies with wings
        rubberDuck.performFly(); // Rubber duck can't fly

        // Change the fly behavior dynamically
        mallard.setFlyBehavior(new FlyRocketPowered()); // Mallard duck flies with a rocket
        mallard.performFly(); // Mallard duck flies with a rocket

        // You can similarly change the fly behavior for other ducks dynamically.
    }
}
