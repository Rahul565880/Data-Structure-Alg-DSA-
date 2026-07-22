import java.util.Scanner;

public class searchArrayele {
    public static void main(String[] args) {
        System.out.println("size of array");
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("store elments in array ");
        int arr[] = new int [n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("enter element to search");
        int s = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i] == s) {
                System.out.println("the element is" + s + " at " + i);
            }

        }

            System.out.println("Element  are not present in array");


    }
}
