import java.util.*;
import java.io.*;

class solution1{

    public  void manage(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of row ");
        int m=sc.nextInt();
        System.out.println("Enter the no of column ");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("Enter the element for array at position [" + i + "][" + j + "]: ");
                int a=sc.nextInt();
                arr[i][j]=a;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the value of r1 ");
        int r1=sc.nextInt();
        System.out.println("Enter the value of c1 ");
        int c1=sc.nextInt();
        System.out.println("Enter the value of r2 ");
        int r2=sc.nextInt();
        System.out.println("Enter the value of c2 ");
        int c2=sc.nextInt();
        int sum=0;
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                System.out.print(arr[i][j]+" ");
                sum=sum+arr[i][j];
            }
            System.out.println();
        }
        System.out.println(sum);
        
    }
}






public class prefixSumForceApporoach1 {
    public static void main(String[] args) {
        solution1 obj=new solution1();
        obj.manage();
    }
}
