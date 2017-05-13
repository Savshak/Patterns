package SimpleUDuck___StrategyDesignPattern;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyingBehavior(new FlyRocketPowered());
        model.performFly();
    }
}


/*
Strategy Design pattern:
    defines  a family of algorithms, encapsulates each one,
    and makes them interchangeable.
    Strategy lets the algorithm vary independently
    from clients that use it
 */