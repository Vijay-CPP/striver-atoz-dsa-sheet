class InsertionSort {
    public void sort(int[] arr) {
        int size = arr.length;

        for (int i = 1; i < size; i++) {
            int key = arr[i];
            int idx = i - 1;

            while (idx >= 0 && arr[idx] > key) {
                arr[idx + 1] = arr[idx];
                idx--;
            }

            arr[idx + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};
        new InsertionSort().sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

