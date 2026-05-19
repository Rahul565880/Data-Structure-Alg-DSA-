import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int size = sc.nextInt();
        int arr[] = new int[size];


        System.out.println("Enter the element to store in the arrays");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i =1;i<size;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Minimum value in array: " + min);
    }
}
