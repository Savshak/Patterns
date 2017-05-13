package WeatherStation___ObserverDesighnPattern;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);

        weatherData.setMessurments(80, 65, 30.3f);
        weatherData.setMessurments(90, 70, 31.3f);
        weatherData.setMessurments(100, 76, 32.3f);

    }
}

/*
Observer:
    defines a one to many dependency
    between  objects  so that when one object
    changes state, all its dependts are notified and
    updated automatically
 */
