import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an linked list ");
        int n = sc.nextInt();


        LinkedList<Integer> ll = new LinkedList<>();

        System.out.println("Enter the elements to store in liked list ");
        for(int i=0;i<n;i++) {
            ll.addFirst(sc.nextInt());
        }

        System.out.print("Elements: ");
        for(Object x : ll) {
            System.out.print(x  + " ");
        }

    }
}
