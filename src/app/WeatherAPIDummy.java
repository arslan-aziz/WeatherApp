package src.app;

public class WeatherAPIDummy {

    private static WeatherAPIDummy wap = null;


    private WeatherAPIDummy(){
    }

    public static WeatherAPIDummy getInstance(){
        if(wap == null){
            wap = new WeatherAPIDummy();
        }
        return wap;
    }

    public double getWeather(String location){
        CurrentWeather cwd = null;
        return Math.random()*100;
    }

}
