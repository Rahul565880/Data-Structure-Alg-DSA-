
import java.util.Scanner;
public class SearchingWordInArrays  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("enter the arrays words: ");
        String arr[] = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        System.out.print("enter the element to search:");
        String key = sc.next();
        search(arr,key);
    }

    public static void search(String arr[],String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] .equals(key)) {
                System.out.println("Key is found : " + i);

                return;
            }
        }

        System.out.println("Key is not found");
    }
}