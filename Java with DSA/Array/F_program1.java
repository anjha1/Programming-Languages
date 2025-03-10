import java.util.*;

public class F_program1 {

    public static void printArray(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println("Array reversed successfully.");
    }

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

        while (true) {
            System.out.println("Press 1 to Print Array");
            System.out.println("Press 2 to Reverse Array");
            System.out.println("Press 3 to Exit");
            System.out.print("Choose an option: ");
            int choose = sc.nextInt();

            if (choose == 1) {
                printArray(arr);
            } else if (choose == 2) {
                reverseArray(arr);
                printArray(arr);
            } else if (choose == 3) {
                System.out.println("Exiting program...");
                sc.close();
                System.exit(0);
            } else {
                System.out.println("Invalid choice! Try again.");
            }
            System.out.println();
        }
    }
}
