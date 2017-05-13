package FactoryMethod;

public class ChigagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChigagoCheesePizza();
        } else if (type.equals("bacon")) {
            return new ChigagoBaconPizza();
        } else {
            return null;
        }
    }
}
