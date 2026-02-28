package FacadePattern;

import java.util.List;

// The package of data the Facade will hand back to the client
class DashboardDTO {
    public String profile;
    public List<String> orders;
    public List<String> recommendations;

    public DashboardDTO(String profile, List<String> orders, List<String> recommendations) {
        this.profile = profile;
        this.orders = orders;
        this.recommendations = recommendations;
    }

    @Override
    public String toString() {
        return "--- Mobile Dashboard ---\n" +
                profile + "\n" +
                "Recent Orders: " + orders + "\n" +
                "Recommended for you: " + recommendations + "\n" +
                "------------------------";
    }
}
