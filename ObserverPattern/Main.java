package ObserverPattern;

import javax.print.attribute.standard.MediaSize;

public class Main {
    public static void main(String[] args) {
        SubA subA = new SubA();
        SubB subB = new SubB();
        SubC subC = new SubC();
        SubD subD = new SubD();

        JazeeraNews jazeeraNews = new JazeeraNews();
        NationalNews nationalNews = new NationalNews();
        UnitedNews unitedNews = new UnitedNews();

        jazeeraNews.registerObservers(subA);
        jazeeraNews.registerObservers(subB);
        jazeeraNews.setLatestNews("Today bank robbery");

        nationalNews.registerObservers(subC);
        nationalNews.registerObservers(subB);
        nationalNews.setLatestNews("Today bomb blast");

        unitedNews.registerObservers(subA);
        unitedNews.registerObservers(subD);
        unitedNews.setLatestNews("Today NASA launched rocket");


    }
}
