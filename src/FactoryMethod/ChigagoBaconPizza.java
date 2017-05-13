package FactoryMethod;

public class ChigagoBaconPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare Chigago bacon pizza");
    }

    @Override
    public void bake() {
        System.out.println("bake Chigago bacon pizza");
    }
}
