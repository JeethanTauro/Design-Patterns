package FacadePattern;

import java.util.Arrays;
import java.util.List;

public class OrderService {
    public List<String> getRecentOrders(String userId){
        return Arrays.asList("Order #101 : Laptop","Order #102: Mobile");
    }
}
