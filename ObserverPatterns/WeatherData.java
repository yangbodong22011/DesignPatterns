package ObserverPatterns;

import java.util.ArrayList;

/**
 * Created by kiosk on 11/30/16.
 */
public class WeatherData implements Subject {
    private ArrayList arrayList = new ArrayList();
    private int x;
    private int y;
    private int z;


    public void addobserver(Observer ob) {
        arrayList.add(ob);

    }

    public void delobserver(Observer ob) {
        int i = arrayList.indexOf(ob);
        if(i >= 0) {
            arrayList.remove(i);
        }
    }

    public void notifyobserver() {
        for (int i = 0; i < arrayList.size(); i++) {
            Observer ob = (Observer) arrayList.get(i);
            ob.update(x,y,z);
        }

    }

    public void setvalue(int a,int b,int c) {
        this.x = a;
        this.y = b;
        this.z = c;
        notifyobserver();
    }
}
