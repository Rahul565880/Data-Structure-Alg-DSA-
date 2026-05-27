import java.util.*;
import java.util.Arrays;

public class BubbleSortPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Read input strings and strip brackets
        String[] s1Arr = sc.nextLine().replace("[", "").replace("]", "").split(", ");
        String[] s2Arr = sc.nextLine().replace("[", "").replace("]", "").split(", ");

        // 2. Create integer arrays with matching lengths
        int[] arr1 = new int[s1Arr.length];
        int[] arr2 = new int[s2Arr.length];

        // 3. Parse elements into arr1
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(s1Arr[i]);
        }

        // 4. Parse elements into arr2
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(s2Arr[i]);
        }

        // 5. Merge both arrays into arr3
        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        int j = arr1.length;
        for (int i = 0; i < arr2.length; i++) {
            arr3[j] = arr2[i];
            j++;
        }

        // 6. Sort and print using correct syntax
        isSort(arr3);
        System.out.println(Arrays.toString(arr3));
    }

    // Bubble Sort Function (Fixed: parameter changed to int[] arr3)
    public static void isSort(int[] arr3) {
        int n = arr3.length;
        for (int i = 0; i < n - 1; i++) {
            for (int k = 0; k < n - i - 1; k++) {
                // Fixed: changed 'arr' to 'arr3' to match your array variable name
                if (arr3[k] > arr3[k + 1]) {
                    int temp = arr3[k];
                    arr3[k] = arr3[k + 1];
                    arr3[k + 1] = temp;
                }
            }
        }
    }
}