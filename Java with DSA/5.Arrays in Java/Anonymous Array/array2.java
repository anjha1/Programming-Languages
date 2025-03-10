class Calc {
    public int add(int[] array) {
        int sum = 0;
        for (int n : array) {
            sum += n;
        }
        return sum; 
    }
}

public class array2 {
    public static void main(String[] args) {


        Calc obj1 = new Calc();
        int k = obj1.add(new int [] {1, 4, 6, 8});
        System.out.println(k); 
    }
}
