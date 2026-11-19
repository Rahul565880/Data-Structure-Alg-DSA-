public class SecondLargestNumber {
    public static void main(String[] args) {
        int arr []= {1, 4,7,6,8,4,10};

        int largest  = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;


        for(int num : arr ) {
            if(num > largest){
                secLargest = largest;
                 largest =  num;
                
            } else if (num > secLargest && num != largest) {
                secLargest = num;
            }
        }
        if(secLargest == Integer.MIN_VALUE) {
            System.out.println("second largest element id not found");
        }
        else {
            System.out.println("The second largest element is : " + secLargest);
        }

    }
}
