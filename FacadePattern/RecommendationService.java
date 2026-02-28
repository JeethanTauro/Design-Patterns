package FacadePattern;

import java.util.Arrays;
import java.util.List;

public class RecommendationService {
    public List<String> getRecommendations(String userId) {
        return Arrays.asList("Mechanical Keyboard", "Wireless Mouse");
    }
}
