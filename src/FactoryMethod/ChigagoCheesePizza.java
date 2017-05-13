package FactoryMethod;

public class ChigagoCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare Chigago cheese pizza");
    }

    @Override
    public void bake() {
        System.out.println("bake Chigago cheese pizza");
    }
}
