
import java.util.Scanner;
public class ReplaceString {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Strin1 , String2, String3 :");
            String str1 = scan.next();
            String str2 = scan.next();
            String str3 = scan.next();
            String newStr1 = str1.replaceAll("[AEIOUaeiou]", "%");
            System.out.println(newStr1);
            String newStr2 = str2.replaceAll("[^AEIOUaeiou]", "#");
            System.out.println(newStr2);
            String newStr3 = str3.toUpperCase();
            System.out.println(newStr3);
            String result = newStr1+newStr2+newStr3;
            System.out.println(result);
        }
    }