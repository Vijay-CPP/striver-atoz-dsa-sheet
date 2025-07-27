//import java.lang.*;
import java.util.*; 

class ReverseArray{
    private static void reverseArray(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }

        // Swap the elements
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call
        reverseArray(arr, start + 1, end - 1);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Reversed array:");
        reverseArray(arr, 0, n - 1);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}