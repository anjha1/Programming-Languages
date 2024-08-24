import java.util.Scanner;

public class patternprinting9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Check conditions for printing '*'
                if (i + j == n + 1 || i == j) {
                    // Only print '*' for the upper half
                    if (i <= n / 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } 
                // Print '*' for first and last columns
                else if (j == 1 || j == n) {
                    System.out.print("*");
                } 
                // Print space for other positions
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
        
        sc.close(); // Close the scanner
    }
}
