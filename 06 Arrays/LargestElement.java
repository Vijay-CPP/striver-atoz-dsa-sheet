public class LargestElement {
    public int findLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        LargestElement finder = new LargestElement();
        int[] arr = { 45, 23, 67, 12, 89, 34 };
        int largest = finder.findLargest(arr);
        System.out.println("Largest element in the array: " + largest);
    }
}
