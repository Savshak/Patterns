package FactoryMethod;

public class Launch {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("bacon");

        System.out.println("_____________");

        pizzaStore = new ChigagoPizzaStore();
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("bacon");

    }
}

/*
The Factory Method Pattern defines an interface
for creating an object, but lets subclasses decide which
class to instantiate. Factory Method lets a class defer
instantiation to subclasses.
 */
