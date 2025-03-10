import java.util.Scanner;

public class patternprinting10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n =sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
              
                if (i+j<=(n/2)+1||i-j>=n/2||j-i>=n/2||i+j>=n+(n/2) || i==1 || j==1 || i==n || j==n){

                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println(" ");
        }

    }
}
