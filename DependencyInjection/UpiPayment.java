package DependencyInjection;

public class UpiPayment implements Payment {
    @Override
    public String pay() {
        return "UPI";
    }
}
