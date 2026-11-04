import java.util.Arrays;
import java.util.Scanner;

public class ReplaceZeroesWithGivenValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter the elements to store in the array ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();

        for(int i=0;i<arr.length;i++) {
            if(arr[i] == 0) {
                arr[i] = target;
            }
        }
        System.out.println("The array is " + Arrays.toString(arr));
    }
}
