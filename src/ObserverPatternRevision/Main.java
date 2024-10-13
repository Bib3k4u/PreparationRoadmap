package ObserverPatternRevision;

public class Main {
    public static void main(String[] args) {
        //subject creation
        NewsAgency agency = new NewsAgency();

        //Observers
        NewsChannel bbc = new NewsChannel("BBC");
        NewsChannel aajtak = new NewsChannel("aajtak");
        NewsChannel cnn = new NewsChannel("cnn");

        // Register observers with the subject
        agency.addObserver(bbc);
        agency.addObserver(aajtak);
        agency.addObserver(cnn);

        // Change state of subject (update news)
        agency.updateNews("New covid-19 varient detected");


        // Remove an observer (CNN)
        agency.removeObserver(cnn);

        //again update news
        agency.updateNews("Stock market keep crashing in India due to many reasons");


    }
}
