class solution{
    public void missing(int arr[]){
        int n=arr.length+1;
        int sum=(n*(n+1))/2;
        int sum1=0;
        for(int i=0;i<arr.length;i++){
            sum1=sum1+arr[i];
        }
        int t=sum-sum1;
        System.out.println(t);
    }
}


public class missingArray {
    public static void main(String[] args) {
        solution obj=new solution();
        int arr[]={1,7,3,4,5,6};
        obj.missing(arr);
    }
}
