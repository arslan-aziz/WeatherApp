package src.app;

import net.aksingh.owmjapis.core.OWM;
import net.aksingh.owmjapis.api.APIException;
import net.aksingh.owmjapis.model.CurrentWeather;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        OWM owm = new OWM("WeatherAPI.API_KEY");
    }
}