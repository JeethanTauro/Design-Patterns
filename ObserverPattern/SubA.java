package ObserverPattern;

public class SubA implements Observer {
    @Override
    public void pushUpdate(String s) {
        System.out.println("Sub A : "+s);
    }

    @Override
    public void pullUpdate(Subject subject) {

        if (subject instanceof News news) {
            System.out.println("Sub A received: "
                    + news.getLatestNews()
                    + " from "
                    + news.getSourceName());
        }
    }

}
