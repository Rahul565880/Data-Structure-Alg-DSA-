import java.util.Arrays;

public class ReveresingAnArray {
    public static void main(String[] args) {
         int arr[] = {10, 20,30,40,50,60};

         int start = 0;
         int end = arr.length-1;

         while (end > start) {
             int temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;

             start++;
             end--;
         }
        System.out.println("Reverse array: " + Arrays.toString(arr));
    }
}
