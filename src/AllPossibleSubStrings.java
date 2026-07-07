import java.util.Scanner;

public class AllPossibleSubStrings {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            for(int i=0; i<=s.length()-1; i++)
            {
                String temp = "";
                for(int j=i; j<=s.length()-1; j++)
                {
                    temp = temp+s.charAt(j);
                    System.out.println(temp);
                }
            }
        }

}
