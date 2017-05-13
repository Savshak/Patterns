package SimpleUDuck___StrategyDesignPattern;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
