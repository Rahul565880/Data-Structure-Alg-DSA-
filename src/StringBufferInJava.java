import java.util.Scanner;

public class StringBufferInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer sb =  new StringBuffer(s);
        //System.out.println(sb);
        //String st = sc.next();
        //sb.append(st);
        //System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
