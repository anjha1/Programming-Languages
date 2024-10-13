class solution{
    public void reversalArray(int arr[]){
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        for(int p:arr){
            System.out.println(p);
        }
    }
}



public class reverseArray1 {
    public static void main(String[] args) {
        solution obj=new solution();
        int arr[]={1,33,655,9,6};
        obj.reversalArray(arr);
    }
}
