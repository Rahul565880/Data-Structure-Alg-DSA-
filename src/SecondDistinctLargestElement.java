
import java.util.Scanner;

    public class SecondDistinctLargestElement {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            if (!scanner.hasNextInt()) {
                System.out.println("No second smallest distinct value");
                return;
            }

            int n = scanner.nextInt();
            if (n < 2) {
                System.out.println("No second smallest distinct value");
                return;
            }

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            long smallest = Long.MAX_VALUE;
            long secondSmallest = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                long current = arr[i];

                if (current < smallest) {
                    secondSmallest = smallest;
                    smallest = current;
                } else if (current > smallest && current < secondSmallest) {
                    secondSmallest = current;
                }
            }

            if (secondSmallest == Long.MAX_VALUE) {
                System.out.println("No second smallest distinct value");
            } else {
                System.out.println(secondSmallest);
            }
        }
    }