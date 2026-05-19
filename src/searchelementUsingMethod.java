
import java.util.Scanner;

public class searchelementUsingMethod  {

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
        search(arr,key);
    }

    public static void search(int arr[],int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Key is found : " + i);
                return;
            }
        }

        System.out.println("Key is not found");
    }
}