public class PangramChecker {
    public static void main(String[] args) {
        String str = "The Quick Brown Fox Jumps Over Lazy Dog";
        str = str.replace(" ", "");
        str = str.toUpperCase();
        boolean flag = true;

        char ch[] = str.toCharArray();
        int arr[] = new int[26];
        for (int i = 0; i < ch.length; i++) {
            arr[ch[i] - 65]++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        
    }
}
