package src.app;
import javax.swing.Timer;

import app.WeatherAppOutputField;

import javax.swing.JFrame;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class WeatherAppFrame extends JFrame implements ActionListener{

    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    //Content pane elements
    private WeatherAPI weatherAPI = null;
    private WeatherAppSearchBar searchBar = null;
    private WeatherAppSearchButton searchButton = null;
    private WeatherAppOutputField outputField = null;

    //instance variables for contentpane elements which update-->gui de
    private double temperature;
    private String location;

    public WeatherAppFrame(){

        weatherAPI = WeatherAPI.getInstance();

        setSize(WIDTH,HEIGHT);

        //add listener to close window
        addWindowListener(WeatherAppCloser.getInstance());
        
        //create element container
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        
        //add text field
        searchBar = WeatherAppSearchBar.getInstance();
        searchBar.addActionListener(this);
        contentPane.add(searchBar);

        searchButton = WeatherAppSearchButton.getInstance();
        searchButton.addActionListener(this);
        contentPane.add(searchButton);

        outputField = WeatherAppOutputField.getInstance();
        contentPane.add(outputField);
        
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String source = e.getActionCommand();
        //cases: timer,search button, text field
        switch(source){
            case "SearchBar":
                location = searchBar.getText();
            break;
            case "SearchButton":
                temperature = weatherAPI.getWeather(location);
                outputField.setText("The temperature at "+location+" is "+temperature+" degrees Fahrenheit.");
            break;
            default:
                System.out.println("Not a recognizable action event: "+source);
            break;
        }
    }
}