public class R_TrappingRainWater {
    public static void R_TrappingRainWater(int arr[]) {
        int n = arr.length;
    
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];


        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }


        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }


        int sum = 0;
        for (int i = 0; i < n; i++) {
            int minHeight = Math.min(leftMax[i], rightMax[i]);
            if (minHeight > arr[i]) {
                sum += minHeight - arr[i];
            }
        }

        System.out.println("Total Trapping Rain Water is " + sum);
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        R_TrappingRainWater(arr);
    }
}
