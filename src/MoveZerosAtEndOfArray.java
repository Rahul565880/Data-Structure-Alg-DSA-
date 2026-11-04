import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosAtEndOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter the elements to store in the array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;

        // Move non-zero elements
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with zero
        for (int i = index; i < n; i++) {
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
