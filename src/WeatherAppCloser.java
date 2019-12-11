import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WeatherAppCloser extends WindowAdapter{

    private static WeatherAppCloser singleton = null;
    private WeatherAppCloser(){

    }

    public void windowClosing(WindowEvent e){
        System.exit(0);
    }

    public static WeatherAppCloser createInstance(){
        if(singleton == null){
            singleton = new WeatherAppCloser();
        }
        return singleton;
    }
}