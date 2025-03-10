class Calc {
    public int add(int[] array) {
        int sum = 0;
        for (int n : array) {
            sum += n;
        }
        return sum; 
    }
}

public class array1 {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 8};

        Calc obj1 = new Calc();
        int k = obj1.add(array);
        System.out.println(k); 
    }
}
