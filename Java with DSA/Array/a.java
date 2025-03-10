public class a {
    public static void prefixSubArraySum(int arr[]) {
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
        prefixSubArraySum(arr);
    }
}