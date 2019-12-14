package src.app;

import javax.swing.Timer;

public class UpdateTimer extends Timer{

    private static UpdateTimer timer = null;
    private static final int DELAY = 10000;

    private UpdateTimer(){
        super(DELAY,WeatherAppActionListener.getInstance());
        setActionCommand("Timer");
    }

    public static UpdateTimer getInstance(){
        if(timer == null){
            timer = new UpdateTimer();
        }
        return timer;
    }
}