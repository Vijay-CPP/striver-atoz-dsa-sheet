class SelectionSort {
    public void sort(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            int currMinIdx = i;

            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[currMinIdx]) {
                    currMinIdx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[currMinIdx];
            arr[currMinIdx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        new SelectionSort().sort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
