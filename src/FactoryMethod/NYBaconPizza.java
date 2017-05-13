package FactoryMethod;

public class NYBaconPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare NYBaconPizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake NYBaconPizza");
    }
}
