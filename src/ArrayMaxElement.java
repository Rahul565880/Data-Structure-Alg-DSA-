import java.util.Scanner;

public class ArrayMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int size = sc.nextInt();
        int arr[] = new int[size];


        System.out.println("Enter the element to store in the arrays");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i =1;i<size;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.print("Arrays: [");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Maximum value in array: " + max);
    }
}
