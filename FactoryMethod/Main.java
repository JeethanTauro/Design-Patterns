package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        //the createNotification will be of the EmailService type
        NotificationService notificationService = new EmailService();

        notificationService.notifyUser("You Failed");
    }
}
