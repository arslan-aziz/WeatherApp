package src.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WeatherAppActionListener implements ActionListener{

    private static WeatherAppActionListener actionListener = null;
    private int temperature;
    private String location;
    private boolean updated;

    private WeatherAppActionListener(){
        updated = true;
    }

    public static WeatherAppActionListener getInstance(){
        if(actionListener == null){
            actionListener = new WeatherAppActionListener();
        }
        return actionListener;
    }

    public void actionPerformed(ActionEvent e){
        String source = e.getActionCommand();
        //cases: timer,search button, text field
        switch(source){
            case "GET":
                updated = false;
            break;
            case "SearchBar":
                
            break;
            case "SearchButton":
            break;
            case "Timer":
            break;
            default:
            break;
        }
    }

    public boolean isUpdated(){
        return updated;
    }

    public int getTemperature(){
        return temperature;
    }
    public String getLocation(){
        return location;
    }
}