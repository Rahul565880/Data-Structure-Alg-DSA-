import java.util.Scanner;

public class Merging2Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word to merge");
        String  s1 = sc.next();
        String s2 = sc.next();
        String s3 = s1 + s2;
        System.out.println("The words  are " + s3);

    }
}
