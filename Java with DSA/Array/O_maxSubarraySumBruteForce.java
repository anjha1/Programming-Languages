public class O_maxSubarraySumBruteForce {
    public static void maxSubarraySumBruteForce(int arr[]){
        int largestsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum=sum+arr[k];
                    if(sum>largestsum){
                        largestsum=sum;
                    }
                }
                System.out.print("Sum of Sub-Array "+sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max-Subarray Sum - I (Brute Force) is : "+largestsum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        maxSubarraySumBruteForce(arr);
    }
}
