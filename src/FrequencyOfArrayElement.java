import java.util.Scanner;

public class FrequencyOfArrayElement {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int visited[]=new int[size];
        for(int i=0;i<size;i++){
            if(visited[i]==1){
                continue;
            }
            int count = 1;
            for(int j = i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=1;
                }
            }
            System.out.println(arr[i]+ " " + count);
        }
    }
}
