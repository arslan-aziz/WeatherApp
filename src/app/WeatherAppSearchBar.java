package src.app;
import javax.swing.JTextField;

//perform all text field settings in this file

public class WeatherAppSearchBar extends JTextField{

    private static WeatherAppSearchBar singleton=null;

    private WeatherAppSearchBar(){
        setActionCommand("SearchBar");
    }

    public static WeatherAppSearchBar getInstance(){
        if(singleton == null){
            singleton = new WeatherAppSearchBar();
        }
        return singleton;
    }
}
