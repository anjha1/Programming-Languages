class solution{
    public void  TwoDArrayPrint(int arr [][]){

        Transpose(arr);
        rotation(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        

    }
    public void Transpose(int arr[][]){
        for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;

           }

        }

    }
    public void rotation(int arr[][]){
        for(int j=0;j<arr.length/2;j++){
            for(int i=0;i<arr.length;i++){
                int temp= arr[i][j];
                arr[i][j]=arr[i][arr[0].length-1-j];
                arr[i][arr[0].length-1-j]=temp;
            }
        }
    }
}


public class rotationalArray {
    public static void main(String[] args) {
        solution obj=new solution();
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        obj.TwoDArrayPrint(arr);
    }
    
}


