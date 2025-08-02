class MergeSort {
    public void mergeSort(int start, int end, int[] arr) {
        if (start >= end)
            return;

        int mid = start + (end - start) / 2;

        mergeSort(start, mid, arr);
        mergeSort(mid + 1, end, arr);
        merge(start, end, mid, arr);
    }

    public void merge(int start, int end, int mid, int[] arr) {
        int size1 = mid - start + 1;
        int size2 = end - mid;

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        for (int i = 0; i < size1; i++)
            arr1[i] = arr[start + i];
        for (int i = 0; i < size2; i++)
            arr2[i] = arr[mid + 1 + i];

        int i = 0, j = 0, k = start;

        while (i < size1 && j < size2) {
            if (arr1[i] <= arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }

        while (i < size1)
            arr[k++] = arr1[i++];
        while (j < size2)
            arr[k++] = arr2[j++];
    }

    public static void main(String[] args) {
        int[] arr = { 8, 3, 5, 4, 7, 6, 1, 2 };
        MergeSort sorter = new MergeSort();
        sorter.mergeSort(0, arr.length - 1, arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
