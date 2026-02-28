package FacadePattern;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        OrderService orderService = new OrderService();
        RecommendationService recommendationService = new RecommendationService();
        ApiGatewayFacade apiGatewayFacade = new ApiGatewayFacade(userService,orderService,recommendationService);

        DashboardDTO dashboardDTO = apiGatewayFacade.getMobileDashboard("10");
        System.out.println(dashboardDTO.toString());
    }
}
