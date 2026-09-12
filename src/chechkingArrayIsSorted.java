
import java.util.Scanner;

public class chechkingArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Loop up to n - 1 to prevent ArrayIndexOutOfBoundsException
        for (int i = 0; i < n - 1; i++) {
            // If any element is strictly greater than the next element, it's not sorted
            if (arr[i] > arr[i + 1]) {
                System.out.println(0);
                return;
            }
        }

        // If no out-of-order element is found
        System.out.println(1);
    }
}