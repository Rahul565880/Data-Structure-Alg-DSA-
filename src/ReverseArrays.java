import java.util.*;
import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size to store");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the element to store");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(arr));


        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
        System.out.println("Reverse array: " + Arrays.toString(arr));
    }
}
