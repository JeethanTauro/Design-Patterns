package DependencyInjection;

public class Main {
    public static void main(String[] args) {
        //Payment payment = new CreditPayment(); // if we have a different implementation we just have to change it over here, we dont have to change the class User
        Payment payment = new UpiPayment();
        User user = new User(payment);
        user.pay();
    }
}
