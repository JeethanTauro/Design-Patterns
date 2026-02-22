package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class News implements Subject {
    String sourceName;
    String latestNews;
    public News(String s){
        sourceName = s;
    }
    List<Observer> observers = new ArrayList<>();
    @Override
    public void registerObservers(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObservers(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.pullUpdate(this);
        }
    }

    public void setLatestNews(String latestNews){
        this.latestNews = latestNews;
        notifyObservers();
    }
    public String getLatestNews(){
        return this.latestNews;
    }
    public String getSourceName(){
        return this.sourceName;
    }
}
