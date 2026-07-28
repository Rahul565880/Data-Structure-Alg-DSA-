import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList3 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array list");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter the elements in array list");

        for(int i=0;i<n;i++) {
            al.add(sc.nextInt());
        }
        System.out.println("Size of " + al.size());

        System.out.println("Enter the element of index");
        int index = sc.nextInt();
        System.out.println("enter the element to add");
        int ele = sc.nextInt();

        al.set(index,ele);

        System.out.print("Elements : " );
        for(Object x : al) {
            System.out.print(x + " ");
        }

    }
}
