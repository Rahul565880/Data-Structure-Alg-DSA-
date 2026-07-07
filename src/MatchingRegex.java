import java.util.Scanner;

public class MatchingRegex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string to match: ");
        String s = sc.nextLine();

        if(s.matches("[a-zA-Z0-9]*")){
            System.out.println("The pattern is matching with  string ");
        }
        else  {
            System.out.println("the string is not matching");
        }
    }
}
