package DependencyInjection;

public class CreditPayment implements Payment{
    @Override
    public String pay() {
        return "Credit Card";
    }
}
