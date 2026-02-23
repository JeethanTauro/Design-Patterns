package DependencyInjection;

public class User {
    private final Payment payment;

    public User(Payment payment){
        this.payment = payment;
    }

    void pay(){
        System.out.println("Paying with "+payment.pay());
    }
}
