import java.util.*;
import java.io.*;

class solution2{

    public void inputArray(){

    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of row ");
        int m=sc.nextInt();
        System.out.println("Enter the no of column ");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter the element seprated with spaces ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                // System.out.println("Enter the element for array at position [" + i + "][" + j + "]: ");
                // int a=sc.nextInt();
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("your matrix is ");
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        preRowSum(arr);
    }

    public void preRowSum(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
        System.out.println("your pre Row wise sum matrix is ");
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        preColumnSum(arr);
    }
    public void preColumnSum(int arr[][]){
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]+=arr[i-1][j];
            }
        }
        System.out.println("your pre Column wise sum matrix is ");
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        calculation(arr);
    }

    public void calculation(int arr[][]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of r1 ");
        int r1=sc.nextInt();
        System.out.println("Enter the value of c1 ");
        int c1=sc.nextInt();
        System.out.println("Enter the value of r2 ");
        int r2=sc.nextInt();
        System.out.println("Enter the value of c2 ");
        int c2=sc.nextInt();
        int totalSum,upperSum,leftSum,upperLeftSum,requiredSum=0;
        totalSum=arr[r2][c2];
        upperSum=arr[r1-1][c2];
        leftSum=arr[r2][c1-1];
        upperLeftSum=arr[r1-1][c1-1];
        requiredSum =totalSum-upperSum-leftSum+upperLeftSum;
        System.out.println();
        System.out.println("Required sum of ["+r1+"]["+c1+"] and ["+r2+"]["+c2+"] is "+requiredSum);

        
    }
}





public class prefixSumQptimizedApproach {
    public static void main(String[] args) {
        solution2 obj=new solution2();
        obj.inputArray();
    }
}
