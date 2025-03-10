public class array4 {
    public static void main(String[] args) {
        int nums[][] = {{1,5,10,15,99,90,77},{2,4,6,8},{3,6,9,12}};
        int row = nums.length; 

        for (int i=0;i<row;i++){

        for (int j=0;j<nums[i].length;j++){
            System.out.print(nums[i][j] + " ");
        }
        
        System.out.println(" ");
        }
        
        
    }
}
