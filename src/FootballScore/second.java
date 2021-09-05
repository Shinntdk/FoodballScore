package FootballScore;

public class second  implements MyObserver{
    public void update(Source o) {
        System.out.println("live result: " + ((HQReport)o).getSomeData());
    }
}
