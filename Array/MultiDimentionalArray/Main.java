import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n + 1];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the position:");
        int pos = sc.nextInt();

        System.out.println("Enter the element:");
        int x = sc.nextInt();

        // Right shift
        for (int i = n - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }

        // Insert element
        arr[pos] = x;

        // Print array
        System.out.println("Array after insertion:");

        for (int i = 0; i < n + 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}