import java.util.Scanner;

public class BinarySearchInArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("enter the arrays element ");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the element to search:");
        int key = sc.nextInt();
        int left =0;
        int right = arr.length-1;

        while (left<=right){
            int mid = (left + right)/2;
            if(arr[mid]==key){
                System.out.println("The key is found at " + mid + "  palce");
                return;
            }
            else if (arr[mid]<key) {
                left = mid +1;
            }
            else if (arr[mid]>key) {
                right = mid - 1;
            }

        }
        System.out.println("key is not found in the array");
    }
}