
import java.util.Arrays;
import java.util.Scanner;
public class InsertionSort {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            if (!sc.hasNextInt()) return;

            // Number of employees
            int n = sc.nextInt();

            // Array to store salaries
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Insertion Sort (Descending Order)
            int s = arr.length;
            for (int i = 1; i < s; i++) {
                int key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] < key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }

            // Print sorted salaries with 2 decimal places
            System.out.print("Sorted Salaries: ");
            System.out.print(Arrays.toString(arr));
        }
    }