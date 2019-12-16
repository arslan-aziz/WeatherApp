package src.app;

import net.aksingh.owmjapis.core.OWM;
import net.aksingh.owmjapis.api.APIException;
import net.aksingh.owmjapis.model.CurrentWeather;

public class WeatherAPI {

    public final static String API_KEY = "474661aa56736c09a66de648d7aee3af";
    private OWM owm;

    public WeatherAPI(){
        owm = new OWM(API_KEY);

    }

    public double getWeather(String location){
        CurrentWeather cwd = owm.currentWeatherByCityName(location);
        weather = (cwd.getMainData.getTempMax()+cwd.getMainData.getTempMin())/2.0;
        return weather;
    }


    public static void main(String[] args)
            throws APIException {
    //API test
    //TODO: handle API exceptions?

        // declaring object of "OWM" class
        OWM owm = new OWM(WeatherAPI.API_KEY);

        // getting current weather data for the "London" city
        CurrentWeather cwd = owm.currentWeatherByCityName("London");

        //printing city name from the retrieved data
        System.out.println("City: " + cwd.getCityName());

        // printing the max./min. temperature
        System.out.println("Temperature: " + cwd.getMainData().getTempMax()
                            + "/" + cwd.getMainData().getTempMin() + "\'K");
    }
}
