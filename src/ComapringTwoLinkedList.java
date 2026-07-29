import java.util.LinkedList;
import java.util.Scanner;

public class ComapringTwoLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedList<Integer> ll = new LinkedList<>();
        for(int i=0;i<n;i++) {
            ll.add(sc.nextInt());
        }

        int n2 = sc.nextInt();
        LinkedList<Integer> ll2 = new LinkedList<>();
        for(int i=0;i<n2;i++){
            ll2.add(sc.nextInt());
        }

        if(ll.equals(ll2)){
            System.out.println("Both list arr equals");
        } else {
            System.out.println("both list  are not same");
        }
    }
}
