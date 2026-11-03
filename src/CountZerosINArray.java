import java.util.Scanner;

public class CountZerosINArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter the elements to store in the array ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        int count =0;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] == 0) {
                count++;
            }
        }
        System.out.println("The number of zeros in array is " + count);
    }
}
