package FactoryMethod;

public class SmsService extends NotificationService{
    @Override
    Notification createNotification() {
        return new SmsNotification();
    }
}
