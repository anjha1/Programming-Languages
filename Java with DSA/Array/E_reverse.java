import java.util.Arrays;
import java.util.Scanner;

public class E_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + " number of Array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Your Array is ");
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;

        }
        System.out.println();
        System.out.print("Reverse Array is ");
        System.out.println(Arrays.toString(arr));
    }
}
