public class array3 {
    public static void main(String[] args) {
        int nums[][] = new int [3][] ;

        nums[0]=new int[3];
        nums[1]=new int[3];
        nums[2]=new int[3];


        // nums[0][0]=2;
        // nums[0][1]=4;
        // nums[0][2]=6;
        // nums[1][0]=6;
        // nums[1][1]=8;
        // nums[1][2]=10;
       

        int row = nums.length; 
        int col = nums[0].length; 

        for (int i=0;i<row;i++){

        for (int j=0;j<col;j++){
            System.out.print(nums[i][j] + " ");
        }

        System.out.println(" ");

        }
    
        
        
    }
    
}
