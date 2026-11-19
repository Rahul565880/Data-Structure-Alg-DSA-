import java.util.Scanner;

public class DuplicateEleArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int dupli = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    System.out.println("The duplicate element is " + arr[i]);
                    dupli++;
                    break;
                }
            }
        }

        if (dupli == 0) {
            System.out.println("No duplicate elements");
        }

        sc.close();
    }
}