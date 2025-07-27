class QuickSort {
    public void sort(int start, int end, int[] arr) {
        if (start >= end)
            return;

        int pivot = partition(start, end, arr);
        sort(start, pivot - 1, arr);
        sort(pivot + 1, end, arr);
    }

    public int partition(int start, int end, int[] arr) {
        int pivEle = arr[start];
        int low = start + 1;
        int high = end;

        while (low <= high) {
            while (low <= end && arr[low] <= pivEle) {
                low++;
            }
            while (high > start && arr[high] > pivEle) {
                high--;
            }

            if (low < high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        }


        int temp = arr[start];
        arr[start] = arr[high];
        arr[high] = temp;

        return high;
    }

    public static void main(String[] args) {
        int[] arr = { 45, 23, 67, 12, 89, 34 };
        QuickSort sorter = new QuickSort();
        sorter.sort(0, arr.length - 1, arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
