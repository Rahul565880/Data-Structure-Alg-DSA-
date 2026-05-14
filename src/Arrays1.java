import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of arrays");
        int size = scan.nextInt();
        int arr[] = new int[size];

        System.out.println("enter the elements to be storde in arrays");
        for (int i = 0;i<size;i++){
            arr[i]= scan.nextInt();
        }
        System.out.println("The array  elements  are:");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }

}
