import java.util.Scanner;

public class SearchElemnetInArray {
    public static void main(String[] args) {
        System.out.println("Enter the size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];


        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();

        }

        boolean found = false;
        int s = sc.nextInt();
        for(int i=0;i< arr.length;i++) {
            if(arr[i] == s) {
                System.out.println("Element found at " + i);
                found = true;
            }

        }
        if(!found) {
                System.out.println("Element is not found");

        }

    }
}
