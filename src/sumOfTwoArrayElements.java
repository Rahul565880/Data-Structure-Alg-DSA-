import java.util.Scanner;

public class sumOfTwoArrayElements {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int n = sc.nextInt();

        System.out.println("enter the  elements to store in array ");
        int arr [] = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target elements :  ");
        int  target = sc.nextInt();

        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                int sum = arr[i] + arr[j];
                if(sum == target) {
                    System.out.println(arr[i] + " " + arr[j]);
                    return;
                }
            }
        }

    }
}
