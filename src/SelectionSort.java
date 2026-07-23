import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the elements to store ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }


        for(int i=0;i<= arr.length-2;i++) {
            int min = arr[i];
            int minIndex = i;
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.print("Sorted array ");
        for(int x: arr){
            System.out.print(x + " ");
        }

    }
}
