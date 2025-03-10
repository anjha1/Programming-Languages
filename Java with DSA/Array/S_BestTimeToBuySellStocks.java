public class S_BestTimeToBuySellStocks {
    public static void BestTimeToBuySellStocks(int arr[]) {
        int max=Integer.MIN_VALUE;
        int buy=0;
        int sell=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int dif=arr[j]-arr[i];
                if(dif>max){
                    max=dif;
                    buy=i;
                    sell=j;
                }
            }
        }
        System.out.println("Max Day to Purches is " + "(Buy Day "+ (buy+1) + " with " + arr[buy]+" Rupees " +", Sell Day "+ (sell+1)+ " with " + arr[sell] +" Rupees " +" ) " + "Profit is " + max +" Rupees ");
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        BestTimeToBuySellStocks(arr);
    }
}
