public class SecondLargestElement {
    public int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1; // Not enough elements to find the second largest
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest; // Return -1 if no second largest found
    }

    public static void main(String[] args) {
        SecondLargestElement finder = new SecondLargestElement();
        int[] arr = { 45, 23, 67, 12, 89, 34 };
        int secondLargest = finder.findSecondLargest(arr);
        System.out.println("Second largest element in the array: " + secondLargest);
    }    
}
