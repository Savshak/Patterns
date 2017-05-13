package Starbuzz_DecoratorDesignPattern;

public abstract class Beverage {
    String description = "Uknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
