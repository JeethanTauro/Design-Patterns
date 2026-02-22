package ObserverPattern;

public class SubC implements Observer {
    @Override
    public void pushUpdate(String s) {
        System.out.println("Sub c:" + s);
    }

    @Override
    public void pullUpdate(Subject subject) {

        if (subject instanceof News news) {
            System.out.println("Sub C received: "
                    + news.getLatestNews()
                    + " from "
                    + news.getSourceName());
        }
    }
}
