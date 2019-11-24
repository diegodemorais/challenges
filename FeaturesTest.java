package aws_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class FeaturesTest {

	@Test
	void testPopularNFeaturesBasic() {
			List<String> features = Arrays.asList("anacell","betacellular","cetracular","deltacellular","eurocell");

			List<String> requests = new ArrayList<>();
			requests.add("Best services provided by anacell");
			requests.add("betacellular has great services");
			requests.add("anacell provides much better services than all other");
			
			List<String> expected = Arrays.asList("anacell","betacellular");
			List<String> result = Features.popularNFeatures(5, 2, features, 3, requests);

			assertEquals(result, expected);
	}
	
	@Test
	void testPopularNFeaturesComplexic() {
			List<String> features = Arrays.asList("anacell","betacellular","cetracular","deltacellular","eurocell");

			List<String> requests = new ArrayList<>();
			requests.add("I love anacell Best services provided by anacell in the town");
			requests.add("betacellular has great services");
			requests.add("deltacellular provides much beter services than betacellular");
			requests.add("cetracalur is worse than eurocell");
			requests.add("betacellular is better than deltacellular");
			
			List<String> expected = Arrays.asList("betacellular","anacell");
			List<String> result = Features.popularNFeatures(5, 2, features, 5, requests);

			assertEquals(result, expected);
	}

}
