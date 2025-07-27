import java.util.*;

public class MaxMinFrequency {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 3, 4, 4, 5, 2, 3, 5, 5};

        // Step 1: Count frequencies using a Map
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find max and min frequency values
        int maxFreq = Collections.max(frequencyMap.values());
        int minFreq = Collections.min(frequencyMap.values());
        
        // Step 3: Find all elements with max frequency and min frequency
        List<Integer> maxFreqElements = new ArrayList<>();
        List<Integer> minFreqElements = new ArrayList<>();
    
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                maxFreqElements.add(entry.getKey());
            }
            if (entry.getValue() == minFreq) {
                minFreqElements.add(entry.getKey());
            }
        }

        // Step 4: Print results
        System.out.println("Frequency Map: " + frequencyMap);
        System.out.println("Max frequency: " + maxFreq);
        System.out.println("Elements with max frequency: " + maxFreqElements);
        System.out.println("Min frequency: " + minFreq);
        System.out.println("Elements with min frequency: " + minFreqElements);
    }
}
