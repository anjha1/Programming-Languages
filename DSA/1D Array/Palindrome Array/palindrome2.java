class Solution {
    public void palindrome_array(int[] arr) {
        boolean isPalindrome = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? "palindrome" : "not a palindrome");
    }
}

public class palindrome2 {
    public static void main(String[] args) {
        Solution abc = new Solution();
        int[] arr = {2, 3, 5, 5, 3, 2,3};
        abc.palindrome_array(arr);
    }
}
