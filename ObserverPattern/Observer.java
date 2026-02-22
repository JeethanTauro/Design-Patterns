package ObserverPattern;

public interface Observer {
    void pushUpdate(String s);
    void pullUpdate(Subject subject);
}
