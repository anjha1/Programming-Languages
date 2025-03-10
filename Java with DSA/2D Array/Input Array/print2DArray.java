class solution{
    public void  TwoDArrayPrint(int arr [][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}


public class print2DArray {
    public static void main(String[] args) {
        solution obj=new solution();
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        obj.TwoDArrayPrint(arr);
    }
    
}