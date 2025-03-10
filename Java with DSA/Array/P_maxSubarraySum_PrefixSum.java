public class P_maxSubarraySum_PrefixSum {
    public static void maxSubarraySum_PrefixSum(int arr[]) {
        int prefixArray[]=new int[arr.length];
        prefixArray[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefixArray[i]=prefixArray[i-1]+arr[i];
        }
        int largestsum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int currentsum=0;
            for(int j=i;j<arr.length;j++){
                currentsum = (i !=0) ? prefixArray[j]-prefixArray[i-1] : prefixArray[j];
                if(currentsum>largestsum){
                    largestsum=currentsum;
                }
            }
        }
        System.out.println("Max-Subarray Sum - II (Prefix Sum ) " + largestsum);
    }
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        maxSubarraySum_PrefixSum(arr);
    }
}



/*
    Visualization of currSum = prefixArray[j] - prefixArray[i-1]

    i (Start Index)   j (End Index)   prefixArray[j]   prefixArray[i-1]   currSum = prefixArray[j] - prefixArray[i-1]
    ---------------------------------------------------------------------------------------------------
    1                 1               prefixArray[1] = -1   prefixArray[0] = 1      -1 - 1 = -2
    1                 2               prefixArray[2] = 5    prefixArray[0] = 1      5 - 1 = 4
    1                 3               prefixArray[3] = 4    prefixArray[0] = 1      4 - 1 = 3
    1                 4               prefixArray[4] = 7    prefixArray[0] = 1      7 - 1 = 6
    2                 2               prefixArray[2] = 5    prefixArray[1] = -1     5 - (-1) = 6
    2                 3               prefixArray[3] = 4    prefixArray[1] = -1     4 - (-1) = 5
    2                 4               prefixArray[4] = 7    prefixArray[1] = -1     7 - (-1) = 8 ✅ (Maximum Sum)
    3                 3               prefixArray[3] = 4    prefixArray[2] = 5      4 - 5 = -1
    3                 4               prefixArray[4] = 7    prefixArray[2] = 5      7 - 5 = 2
    4                 4               prefixArray[4] = 7    prefixArray[3] = 4      7 - 4 = 3
*/