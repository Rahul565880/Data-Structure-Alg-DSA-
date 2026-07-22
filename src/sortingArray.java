import java.util.Arrays;
import java.util.Scanner;

public class sortingArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner  sc = new Scanner(System.in);
        int n  = sc.nextInt();


        System.out.println("Enter the elements in array");
        int arr[] = new int [n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("the unsorted array is to be" + Arrays.toString(arr));
        int s = arr.length;
        for(int i=0;i<n-1;i++) {
            for(int j =i+1;j<n-1-i;j++){
                if(arr[i] > arr[j]) {                   //if(arr[i] > arr[j]) { descending order
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("the sorted array is to be" + Arrays.toString(arr));

    }
}
