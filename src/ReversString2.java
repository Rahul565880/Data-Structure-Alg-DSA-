import java.util.Scanner;

public class ReversString2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();

            char[] arr = str.toCharArray();

            int start = 0;
            int end = arr.length - 1;

            while (start < end) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }

            // Print the reversed character array as a String
            System.out.println(new String(arr));
        }
    }