import java.util.Scanner;

public class sumOfTwoArrayElementsTWOPointer {
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

        int i = 0;
       int  j = arr.length - 1;

        while (i <= j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                System.out.println(arr[i] + " " + arr[j]);
                return;
            }
            else if (sum > target) {
                j--;
            }
            else {
                i++;
            }
        }
        }
    }

