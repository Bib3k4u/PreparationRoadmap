package ObserverPatternRevision;

public class NewsChannel implements Observer{
    String channeName;

    public NewsChannel(String channeName){
        this.channeName = channeName;
    }
    public void update(String news){
        System.out.println(channeName + " " + "Breaking news:  " + news);
    }

    public String getChanneName(String channeName){
        return channeName;
    }

}
