//import java.lang.*;
import java.util.*; 

class CountFrequency {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Get max element to size the frequency array
        OptionalInt maxElementOpt = Arrays.stream(arr).max();
        int maxElement = maxElementOpt.orElse(0); // extract int value safely

        // Create frequency array
        int[] frequency = new int[maxElement + 1];
        for (int i = 0; i < n; i++) {
            frequency[arr[i]]++;
        }

        // Print the frequency of each element
        System.out.println("Frequency of each element:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Element: " + i + ", Frequency: " + frequency[i]);
            }
        }

        // Create a HashMap to store the frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }

        // Print the frequency of each element
        System.out.println("Frequency of each element:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }

        // Print the frequency of each element using forEach
        System.out.println("Frequency of each element using forEach:");
        frequencyMap.forEach((key, value) -> {
            System.out.println("Element: " + key + ", Frequency: " + value);
        });

        sc.close();
    }
}