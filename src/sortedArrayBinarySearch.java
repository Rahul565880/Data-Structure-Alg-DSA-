import java.util.Scanner;

public class sortedArrayBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arrays");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element to store");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key element to search");
        int key = sc.nextInt();
        boolean result = isSorted(arr);
        if (result) {
            binarySearch(arr, key);
        } else {
            System.out.println("Array is  not sorted cant be perfomed");
        }
    }

    public static boolean isSorted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

        public static int binarySearch ( int arr[], int key){
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int mid = (left + right) / 2;
                if (arr[mid] == key) {
                    System.out.println("The key is found at " + mid + "  palce");
                    return mid;

                } else if (arr[mid] < key) {
                    left = mid + 1;
                } else if (arr[mid] > key) {
                    right = mid - 1;
                }
            }
            return -1;
        }
    }

