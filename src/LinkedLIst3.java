import java.util.LinkedList;
import java.util.Scanner;

public class LinkedLIst3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an linked list ");
        int n = sc.nextInt();


        LinkedList<Integer> ll = new LinkedList<>();

        System.out.println("Enter the elements to store in liked list ");
        for(int i=0;i<n;i++) {
            ll.addFirst(sc.nextInt());
        }

        System.out.println("Get the fisrt  elements : " + ll.getFirst());
        System.out.println("Get the fisrt  elements : " + ll.getLast());
        System.out.println("Size of Linked list :" + ll.size());

        System.out.print("Elements: ");
        for(Object x : ll) {
            System.out.print(x  + " ");
        }

    }
}
