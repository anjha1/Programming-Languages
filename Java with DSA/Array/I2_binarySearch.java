public class I2_binarySearch {
    public static int binarySearch(int target,int arr[]){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,7,9,12,20,28};
        System.out.println(binarySearch(20, arr));
    }
}
