public class variable2 {
    public static void main(String[] args) {
        

        // long a = 100000000000000; Show Error because out of range of int
        long a= 100000000000000l;
        long b = 80;
        // int c= a+b; Error because long is greater than int
        long c = a+b;
        System.out.println(c);



        int d = 10;
        int e = 80;
        // int c= a+b; No Error Show because long is greater than int
        long f = d + e;
        System.out.println(f);
        


      
    }
}
