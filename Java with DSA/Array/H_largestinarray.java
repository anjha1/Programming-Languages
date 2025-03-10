import java.util.*;
public class H_largestinarray {
    public static void largestNumber(int arr[]){
        int a=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(a<arr[i]){
                a=arr[i];
            }
        }
        System.out.println("Largest Number in Array is "+a);
    }
    public static void smallestNumber(int arr[]){
        int a=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(a>arr[i]){
                a=arr[i];
            }
        }
        System.out.println("Smallest Number in Array is "+a);
    }
    public static void printArray(int arr[]) {
        System.out.print("Your Array is ");
        System.out.print(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={4,2,7,55,88,553,88,534,54};
        printArray(arr);
        System.out.println();
        largestNumber(arr);
        smallestNumber(arr);
    }
}
