package Builder.CarExample;

public class CarDirector {

    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void build() {
        carBuilder.buildBodyStyle();
        carBuilder.buildBreaks();
        carBuilder.buildEngine();
        carBuilder.buildFuelType();
        carBuilder.buildPower();
        carBuilder.buildSeats();
        carBuilder.buildWindows();
    }
}
