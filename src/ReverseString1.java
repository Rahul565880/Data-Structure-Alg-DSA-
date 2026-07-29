import java.util.Scanner;

public class ReverseString1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char [] arr = str.toCharArray();
        char [] revarr = new char[arr.length];

        int j = arr.length-1;
        for(int i=0;i<arr.length-1;i++) {
            revarr[j] = arr[i];
            j--;
        }
        String revstr = new String(revarr);
        System.out.println(revstr);
    }
}
