package FacadePattern;

import java.util.List;

public class ApiGatewayFacade {
    private final UserService userService;
    private final OrderService orderService;
    private final RecommendationService recommendationService;

    // The Gateway is initialized with its dependencies
    public ApiGatewayFacade(UserService userSvc, OrderService orderSvc, RecommendationService recSvc) {
        this.userService = userSvc;
        this.orderService = orderSvc;
        this.recommendationService = recSvc;
    }

    // The Simplified API Method for the Mobile App
    public DashboardDTO getMobileDashboard(String userId) {
        System.out.println("[Gateway] Fetching data from microservices for user: " + userId + "...");

        // 1. Delegate to subsystems
        String profile = userService.getUserProfile(userId);
        List<String> orders = orderService.getRecentOrders(userId);
        List<String> recommendations = recommendationService.getRecommendations(userId);

        // 2. Aggregate and return
        return new DashboardDTO(profile, orders, recommendations);
    }
}