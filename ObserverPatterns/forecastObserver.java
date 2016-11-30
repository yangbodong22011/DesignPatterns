package ObserverPatterns;

/**
 * Created by kiosk on 11/30/16.
 */
public class forecastObserver implements Observer {
    private Subject myobj;
    private int x;
    private int y;

    public forecastObserver(Subject ob) {
        this.myobj = ob;
        ob.addobserver(this);
    }

    public void update(int a, int b, int c) {
        this.x = a;
        this.y = b;
        display();
    }
    public void display() {
        System.out.println("x is " + x + "  y is " + y);
    }


}
