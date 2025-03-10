public class UpperVSLower1{
    public static void main(String[] args) {
        String s1="anjha";
        String s2="anjha";

        String s3= new String("anjha");
        String s4= new String("anjha");

        String s5= new String("ANJHA");
      

        String s6="ANJHA";

        System.out.println(s1.equals(s2)); // True (due to s1 and s2 both refers to same value)
        System.out.println(s1.equals(s3)); // True  (due to s1 and s2 both refers to same value)
        System.out.println(s1.equals(s5)); // False  (due to  both refers to different different values)
        System.out.println(s1.equals(s6)); // False  (due to  both refers to different different values)
        System.out.println(s3.equals(s2)); // True  (due to s3 and s2 both refers to same value)
        System.out.println(s3.equals(s4)); // True  (due to s3 and s4 both refers to same value)
        System.out.println(s3.equals(s5)); // False  (due to  both refers to different different values)
       

    }
}