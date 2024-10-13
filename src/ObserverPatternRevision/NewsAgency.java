package ObserverPatternRevision;

import java.util.*;

public class NewsAgency implements Subject {
    List<Observer> observers = new ArrayList<>();
    String news;
   @Override
   public void addObserver(Observer observer){
        observers.add(observer);
    }
   @Override
   public void removeObserver(Observer observer){
        observers.remove(observer);
    }
   @Override
   public void notifyObserver(String message){
        for(Observer observer : observers){
            observer.update(message);
        }
    }
    public void updateNews(String news){
       this.news = news;
       notifyObserver(news);
        System.out.println();
    }
    public String getNews(){
        return news;
    }
}
