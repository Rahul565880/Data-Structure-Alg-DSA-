import java.util.*;
public class SearchWordBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] arr = new String[size];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scan.next();
        }
        String key = scan.next();

        boolean sortRes = isSorted(arr);
        if (sortRes) {
            int index = binarySearch(arr, key);
            if (index == -1) {
                System.out.println("Key not found");
            } else {
                System.out.println("Key found at index: " + index);
            }
        } else {
            System.out.println("Array is not sorted. binary search cannot happen");
        }

    }

    static boolean isSorted(String[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    static int binarySearch(String[] arr, String key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (key.compareTo(arr[mid]) == 0) {
                return mid;
            } else if (key.compareTo(arr[mid]) < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}