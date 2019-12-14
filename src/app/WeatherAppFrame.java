package src.app;
import javax.swing.Timer;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;


public class WeatherAppFrame extends JFrame{

        private static final int WIDTH = 400;
        private static final int HEIGHT = 300;
        private static final int TIME_DELAY = 1000;

        private WeatherAppActionListener updateListener = null;

        //instance variables for contentpane elements which update-->gui de

        public WeatherAppFrame(){

            updateListener = WeatherAppActionListener.getInstance();

            setSize(WIDTH,HEIGHT);

            //add listener to close window
            addWindowListener(WeatherAppCloser.getInstance());
            
            //create element container
            Container contentPane = getContentPane();
            contentPane.setLayout(new FlowLayout());
            
            //add text field
            WeatherAppSearchBar searchBar = WeatherAppSearchBar.getInstance();
            contentPane.add(searchBar);

            WeatherAppSearchButton searchButton = WeatherAppSearchButton.getInstance();
            contentPane.add(searchButton);

            UpdateTimer timer = UpdateTimer.getInstance();
            timer.start();

            updateState();
        }

        private void updateState(){
            while(true){
                if(updateListener.isUpdated()){
                    updateListener.actionPerformed(new ActionEvent(this,0,"GET"));
                    updateListener.getParams();
                    gui.update();
                }
                
            }
        }
}