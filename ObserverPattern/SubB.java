package ObserverPattern;

public class SubB implements Observer {
    @Override
    public void pushUpdate(String s) {
        System.out.println("Sub B:"+s);

    }
    @Override
    public void pullUpdate(Subject subject) {

        if (subject instanceof News news) {
            System.out.println("Sub B received: "
                    + news.getLatestNews()
                    + " from "
                    + news.getSourceName());
        }
    }
}
