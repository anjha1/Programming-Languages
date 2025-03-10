public class Q1_MaxSubarraySum_III_Kadane_sAlgorithm {
    public static void kadane_sAlgorithm(int arr[]){
        // int currentSum=0;
        // int maxSum=Integer.MIN_VALUE;
        int currentSum=arr[0];  
        int maxSum=arr[0];
        if (arr.length == 1) { 
            System.out.println("Max-Subarray Sum - III (Kadane's Algorithm) : " + arr[0]);  
            return;
        }
        // Mera wala fix aur optimize hai, kyunki agar array me ek hi element ho, 
        // toh direct print kar diya bina loop chalaye.  

        // -----------------
        // Comparison:
        // | Approach                   | Single Element Case { -5 } | Loops Needed? | Efficiency |
        // |--------------------------- |-------------------|-------------|------------|
        // | Original Kadane's Algorithm| -5               | ✅ (Loop chalega) | O(n)  |
        // | Optimized Approach         | -5               | ❌ (No loop)  | O(1) for single element |

        // -----------------
        // Why This is Better?
        // - Loop na chalao agar zaroorat nahi hai - Direct answer de do.  
        // - Efficiency improve hoti hai single-element cases ke liye (O(1) instead of O(n)).  

        for(int i=1;i<arr.length;i++){
            currentSum = Math.max(arr[i], currentSum + arr[i]); 
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("Max-Subarray Sum - III (Kadane_s Algorithm) : "+maxSum);
    }
    public static void main(String[] args) {
        int arr[]={-1,-2,-3,-4};
        kadane_sAlgorithm(arr);
    }
}