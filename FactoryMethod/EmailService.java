package FactoryMethod;

public class EmailService extends NotificationService{
    @Override
    Notification createNotification() {
        return new EmailNotification();
    }
}
