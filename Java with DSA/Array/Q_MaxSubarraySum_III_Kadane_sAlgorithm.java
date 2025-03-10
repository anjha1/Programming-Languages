public class Q_MaxSubarraySum_III_Kadane_sAlgorithm {
    public static void kadane_sAlgorithm(int arr[]){
        int currentSum=arr[0];  
        int maxSum=arr[0];
        // int currentSum=0;
        // int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];
            if(currentSum>maxSum){
                maxSum=currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }
        }
        System.out.println("Max-Subarray Sum - III (Kadane_s Algorithm) : "+maxSum);
    }
    public static void main(String[] args) {
        int arr[]={-1,-2,-3,-4};
        kadane_sAlgorithm(arr);
    }
}
