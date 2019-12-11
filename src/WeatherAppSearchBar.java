import javax.swing.JTextField;

//perform all text field settings in this file

public class WeatherAppSearchBar extends JTextField{

    private static WeatherAppSearchBar singleton=null;

    private WeatherAppSearchBar(){

    }

    public static WeatherAppSearchBar createInstance(){
        if(singleton == null){
            singleton = new WeatherAppSearchBar();
        }
        return singleton;
    }
}
