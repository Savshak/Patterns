package SimpleUDuck___StrategyDesignPattern;

public class FlyWithWings implements FlyingBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
