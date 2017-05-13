package AbstractFactory;

public class Client {
    AbstractFactory abstractFactory;
    AbstractProductA productA;
    AbstractProductB productB;

    public Client(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public void doSomething() {
        productA = abstractFactory.createProductA();
        productB = abstractFactory.createProductB();

        productA.perform();
        productB.launch();
    }

    public static void main(String[] args) {
        AbstractFactory a = new ConcreteFactory1();
        AbstractFactory b = new ConcreteFactory2();
        Client client1 = new Client(a);
        Client client2 = new Client(b);

        client1.doSomething();
        client2.doSomething();
    }




}

/*
The Abstract Factory Pattern provides an interface
for creating families of related or dependent objects
without specifying their concrete classes
 */
