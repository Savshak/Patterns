package FactoryMethod;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYCheesePizza();
        } else if (type.equals("bacon")) {
            return new NYBaconPizza();
        } else {
            return null;
        }
    }
}
