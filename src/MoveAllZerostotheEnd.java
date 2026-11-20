import java.util.Arrays;

public class MoveAllZerostotheEnd {
    public static void main(String[] args) {
        int arr[] = {0 , 2,2,3,4,0,6,0,0,5,0};

        int index = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while(index < arr.length) {
            arr[index] = 0;
            index++;
        }
        System.out.println("the arra is " + Arrays.toString(arr));
    }
}
