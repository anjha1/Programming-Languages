import java.util.*;

class tolution {
    public void inputArray() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the row: ");
        int m = sc.nextInt();
        System.out.println("Enter the column: ");
        int n = sc.nextInt();

        
        int[][] arr = new int[m][n];

     
        for (int i = 0; i < m; i++) {  
            for (int j = 0; j < n; j++) {  
                System.out.println("Enter the element for array at position [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

      
        System.out.println("The 2D array is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();  
        }
    }
}

public class inputArray {
    public static void main(String[] args) {
   
        tolution obj = new tolution();
        obj.inputArray();
    }
}
