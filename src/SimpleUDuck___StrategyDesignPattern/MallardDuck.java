package SimpleUDuck___StrategyDesignPattern;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyingBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm  a real Mallard duck");
    }
}
