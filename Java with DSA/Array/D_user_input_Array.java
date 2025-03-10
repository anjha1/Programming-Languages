import java.util.*;

public class D_user_input_Array {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + " number of Array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
