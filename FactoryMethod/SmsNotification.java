package FactoryMethod;

public class SmsNotification implements Notification{
    @Override
    public void notify(String str) {
        System.out.println("Sent notification through sms : "+str);
    }
}
