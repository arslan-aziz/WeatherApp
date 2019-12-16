package app;
import javax.swing.JTextField;

//perform all text field settings in this file

public class WeatherAppOutputField extends JTextField{

    private static WeatherAppOutputField singleton=null;

    private WeatherAppOutputField(){
        setEditable(false);
    }

    public static WeatherAppSearchBar getInstance(){
        if(singleton == null){
            singleton = new WeatherAppSearchBar();
        }
        return singleton;
    }
}
