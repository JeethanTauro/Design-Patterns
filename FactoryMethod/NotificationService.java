package FactoryMethod;

public abstract class NotificationService {
    abstract Notification createNotification();
    public void notifyUser(String str){
        Notification notification = createNotification();// instead of using the new keyword we delegate the creation of objects to subclasses
        notification.notify(str);
    }
}
