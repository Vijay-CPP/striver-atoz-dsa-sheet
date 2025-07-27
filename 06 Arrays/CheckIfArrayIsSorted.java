public class CheckIfArrayIsSorted {
    public boolean isSorted(int[] arr) {
        if (arr == null || arr.length == 0) {
            return true; // An empty array is considered sorted
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false; // Found an element that is smaller than the previous one
            }
        }
        return true; // No elements were found out of order
    }

    public static void main(String[] args) {
        CheckIfArrayIsSorted checker = new CheckIfArrayIsSorted();
        int[] arr = { 1, 2, 3, 4, 5 };
        boolean result = checker.isSorted(arr);
        System.out.println("Is the array sorted? " + result);
    }    
}
