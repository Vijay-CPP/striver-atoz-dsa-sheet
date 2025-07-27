class BubbleSort {
    public void sort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSorted = false;
                }
            }
            if (isSorted)
                break;
        }
    }

    public void recursiveSort(int[] arr, int n) {
        if (n == 1) {
            return;
        }

        recursivePass(arr, 0, n);
        recursiveSort(arr, n - 1);
    }

    private void recursivePass(int[] arr, int idx, int n) {
        if (idx == n - 1) {
            return;
        }

        if (arr[idx] > arr[idx + 1]) {
            int temp = arr[idx];
            arr[idx] = arr[idx + 1];
            arr[idx + 1] = temp;
        }

        recursivePass(arr, idx + 1, n);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 2, 8 };
        new BubbleSort().sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}