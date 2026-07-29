import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char [] arr = s.toCharArray();
        String s1 = new String(arr);
        System.out.println(s1);
    }
}
