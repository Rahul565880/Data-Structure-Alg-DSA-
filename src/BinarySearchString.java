import java.util.Scanner;

public class BinarySearchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of students
        int n = sc.nextInt();

        // Read the sorted list of student names
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        // Read the target name to search for
        String key = sc.next();

        // Binary search logic pointers
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            // Compare mid element with the key
            int res = arr[mid].compareTo(key);

            if (res == 0) {
                System.out.println("Student Found");
                return; // Exit program immediately since student is located
            }
            else if (res < 0) {
                left = mid + 1; // Key is in the right half
            }
            else {
                right = mid - 1; // Key is in the left half
            }
        }

        // If the loop finishes without returning, the student does not exist
        System.out.println("Student Not Found");
    }
}