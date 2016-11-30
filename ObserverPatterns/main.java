package ObserverPatterns;

/**
 * Created by kiosk on 11/30/16.
 */
public class main {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();

        forecastObserver fo = new forecastObserver(wd);

        wd.setvalue(1,2,3);
        wd.setvalue(4,5,6);
        wd.setvalue(7,8,9);
    }
}
