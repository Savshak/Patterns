package SimpleUDuck___StrategyDesignPattern;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyingBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm ModelDuck");
    }
}
