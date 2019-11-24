package aws_test;

import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class Features {


	public static ArrayList<String> popularNFeatures(int numFeatures, 
	                                         int topFeatures, 
                                             List<String> possibleFeatures, 
											 int numFeatureRequests, 
											 List<String> featureRequests)
    {
        Map<String, Integer> features = new TreeMap<>(); //a map with feature occurrences
        for (String feature : possibleFeatures) {
            features.put(feature.toLowerCase(), 0);
        }
        for (String request : featureRequests) {
            String words[] = request.toLowerCase().replace(",","").split(" ");
            for (String word : words) {
                if (features.containsKey(word))
                    features.put(word, features.get(word)+1);
                    //System.out.println(word + "> " + features.get(word));
            }
        }

        ArrayList<String> featuresOrdered = new ArrayList<>();        
        features.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            //.forEachOrdered(x -> System.out.println(x.getKey()));
            .forEachOrdered(x -> featuresOrdered.add(x.getKey()));

        ArrayList<String> results = new ArrayList<>();        
        for (int i=0; i< topFeatures; i++)    {
            if (i < topFeatures) {
            	int j = i;
            	while (j +1 < numFeatureRequests &&
            	        features.get(featuresOrdered.get(j)) > 0 &&
            			features.get(featuresOrdered.get(j)) == features.get(featuresOrdered.get(j+1)) &&
            			featuresOrdered.get(j).charAt(0) > featuresOrdered.get(i+1).charAt(0)) {
	                		String temp = featuresOrdered.get(j);
	                		featuresOrdered.set(j, featuresOrdered.get(j+1));
	                		featuresOrdered.set(j+1, temp);
	                		j++;
            	}
            	results.add(featuresOrdered.get(i));            	
            }
        }
        
        return results;
    }

}