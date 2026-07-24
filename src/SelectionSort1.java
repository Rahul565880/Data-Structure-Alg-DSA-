import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        float arr[] = new float[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextFloat();
        }


        for(int i=0;i<n-1;i++) {
            float max = arr[i];
            int maxIndex = i;

            for(int j=i+1;j<n;j++) {
                if(arr[j] < max) {
                    max = arr[j];
                    maxIndex = j;
                }
                float temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
