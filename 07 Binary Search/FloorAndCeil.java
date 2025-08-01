// Floor and Ceil in Sorted Array

// Problem Statement: You're given an sorted array arr of n integers and an integer x. Find the floor and ceiling of x in arr[0..n-1].
// The floor of x is the largest element in the array which is smaller than or equal to x.
// The ceiling of x is the smallest element in the array greater than or equal to x.

public class FloorAndCeil {
    public int findFloor(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        int result = -1; // Default to -1 if not found

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                high = mid - 1;
            } else {
                result = arr[mid];
                low = mid + 1;
            }
        }

        return result; // Return the floor value
    }

    public int findCeil(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        int result = -1; // Default to -1 if not found

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= x) {
                low = mid + 1;
            } else {
                result = arr[mid];
                high = mid - 1;
            }
        }

        return result; // Return the ceil value
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 8, 10, 10, 12, 19 };
        int x = 5;

        FloorAndCeil solution = new FloorAndCeil();
        int floor = solution.findFloor(arr, x);
        int ceil = solution.findCeil(arr, x);

        System.out.println("Floor of " + x + ": " + floor);
        System.out.println("Ceil of " + x + ": " + ceil);
    }
}