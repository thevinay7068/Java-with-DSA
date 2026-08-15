public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Number of passes
        for (int i = 0; i < n - 1; i++) {

            // Compare adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    // Swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 2, 8};

        bubbleSort(arr);

        System.out.print("Sorted Array: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}