
import java.util.*;
public class LinkedIndOpration {

        public static void main(String[] args) {
            ArrayList al = new ArrayList();
            al.add(10);
            al.add(20);
            al.add(30);
            al.add(40);
            al.add(50);

            System.out.println(al);

            // we can store different type of data it store default in the end of array list

            //al.add("java");
            //al.add(4.5);
            //al.add("*");
            System.out.println(al);
            //size
            System.out.println(al.size());

            //contains
            System.out.println(al.contains(20));
            System.out.println(al.contains(1));


            // get
            System.out.println(al.get(3));
            System.out.println(al.getFirst());
            System.out.println(al.getLast());

            //indexOf
            System.out.println(al.indexOf(30));

            // isEmpty
            System.out.println(al.isEmpty());

            // remove based on index
            System.out.println(al.remove(3));

            System.out.println(al);
            al.add(99);
            System.out.println(al);
            al.add(10);

            //index of last element
            al.lastIndexOf(10);
            System.out.println(al);


            //add last and first
            al.addFirst(16);
            al.addFirst(5);
            al.addLast(100);
            System.out.println(al);

            // set method is used to replace the element in array list
            al.set(4, "RAHUL");
            System.out.println(al);

            al.add(2,"JAVA");
            System.out.println(al);



            ArrayList al2 = new ArrayList();
            al2.add(111);
            al2.add(222);
            al2.add(333);
            System.out.println(al2);


            // adding array list to onther array list
            al.addAll(al2);
            System.out.println(al);






        }

    }
