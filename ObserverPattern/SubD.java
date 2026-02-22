package ObserverPattern;

public class SubD implements Observer {
    @Override
    public void pushUpdate(String s) {
        System.out.println("Sub D" + s);
    }

    @Override
    public void pullUpdate(Subject subject) {

        if (subject instanceof News news) {
            System.out.println("Sub D received: "
                    + news.getLatestNews()
                    + " from "
                    + news.getSourceName());
        }
    }
}
