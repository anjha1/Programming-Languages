public class array1 {
    public static void main(String[] args) {
        int nums[][] = {{1,5,10,15},{2,4,6,8},{3,6,9,12}};
        int row = nums.length; 
        int col = nums[0].length; 

        for (int i=0;i<row;i++){

        for (int j=0;j<col;j++){
            System.out.println(nums[i][j]);
        }

        }
        
        
    }
}
