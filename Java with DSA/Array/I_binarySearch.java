public class I_binarySearch {
    public static int binarySearch(int target,int arr[]){
        int start=0;
        int last=arr.length-1;
        for(int i=0;i<arr.length-i;i++){
            int midIndex=(start+last)/2;
            if(target==arr[midIndex]){
                return midIndex;
            }
            else if(target>arr[midIndex]){
               start =midIndex+1;
            }
            else{
                last=midIndex-1;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int arr[]={2,4,7,9,12,20,28};
        System.out.println(binarySearch(28, arr));
    }
}
