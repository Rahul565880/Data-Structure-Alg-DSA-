import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the element to store in  arrays");
            for (int i=0; i<arr.length;i++) {
                arr[i] = sc.nextInt();
            }
        System.out.println("unsorted array is to be" + Arrays.toString(arr));
        issortArray(arr);
        System.out.println("Sorted array is to be" + Arrays.toString(arr));

    }
    static void issortArray(int arr[]) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    }
