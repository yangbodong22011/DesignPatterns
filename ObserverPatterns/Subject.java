package ObserverPatterns;

/**
 * Created by kiosk on 11/30/16.
 */
public interface Subject {

    public void addobserver(Observer ob);
    public void delobserver(Observer ob);
    public void notifyobserver();

}
