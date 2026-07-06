
import java.util.*;
import java.util.Arrays;

public class ReversArrayUsingForLoop {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];
            int[] rev = new int[size];

            System.out.println("Enter the array elements:");

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Reverse the array
            for (int i = 0; i < size; i++) {
                rev[i] = arr[size - 1 - i];
            }

            System.out.println("Original Array: " + Arrays.toString(arr));
            System.out.println("Reversed Array: " + Arrays.toString(rev));
        }
    }