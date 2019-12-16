package src.app;
import javax.swing.JButton;

public class WeatherAppSearchButton extends JButton{

    private static WeatherAppSearchButton searchButton = null;

    private WeatherAppSearchButton(){
        setActionCommand("SearchButton");
    }

    public static WeatherAppSearchButton getInstance(){
        if(searchButton == null){
            searchButton = new WeatherAppSearchButton();
        }
        return searchButton;
    }

}