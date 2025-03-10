public class S1_BestTimeToBuySellStocks {
    public static void BestTimeToBuySellStocks(int arr[]) {
        int buy=Integer.MAX_VALUE;
        int large=0;
        for(int i=0;i<arr.length;i++){
            if(buy<arr[i]){
               int p=arr[i]-buy;
                if(large<p){
                    large=p;
                }
            }
            else{
                buy=arr[i];
            }
            
        }
        System.out.println("Max Profit is " + large);
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        BestTimeToBuySellStocks(arr);
    }
}
