import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.FlowLayout;


public class WeatherAppFrame extends JFrame{

        public static final int WIDTH = 400;
        public static final int HEIGHT = 300;



        public WeatherAppFrame(){
            setSize(WIDTH,HEIGHT);

            //add listener to close window
            addWindowListener(WeatherAppCloser.createInstance());
            
            //create element container
            Container contentPane = getContentPane();
            contentPane.setLayout(new FlowLayout());
            
            //add text field
            WeatherAppSearchBar searchBar = WeatherAppSearchBar.createInstance();
            searchBar.addActionListener();
            contentPane.add(searchBar);

        }
}