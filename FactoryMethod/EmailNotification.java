package FactoryMethod;

public class EmailNotification implements Notification{

    @Override
    public void notify(String str) {
        System.out.println("Sent notification through Email : "+str);
    }
}
