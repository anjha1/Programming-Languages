public class G_linearSearch {
    public static int linearSearch(int target,int arr[]){
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                return i;
            }
        }
       return -1;
        
    }
    public static void main(String[] args) {
        int arr[]={2,8,33,7,99,4};
        System.out.println(linearSearch(99, arr));
    }
}
