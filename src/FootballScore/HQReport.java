package FootballScore;

import java.util.ArrayList;

public class HQReport implements Source {
    private final ArrayList<MyObserver> list;
    private String someData;

    public HQReport() {
        this.list = new ArrayList<MyObserver>();
    }
    public void setSomeData(String aData) {
	    someData = aData;
	    notifyObservers();
    }
    public String getSomeData() {
	    return someData;
    }
    public void register (MyObserver observer) {
        list.add(observer);
    }
    public void notifyObservers() {
        for (int j = 0; j < list.size(); ++j) {
            list.get(j).update(this);
	}
    }
}
