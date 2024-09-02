public class UpperVSLower{
    public static void main(String[] args) {
        String s1="anjha";
        String s2="anjha";

        String s3= new String("anjha");
        String s4= new String("anjha");

        String s5= new String("ANJHA");
      

        String s6="ANJHA";

        System.out.println(s1==s2); // True (due to s1 and s2 both refers to same object)
        System.out.println(s1==s3); // False  (due to s1 is inside of scp and s3 is outside of scp both referes to different different object)
        System.out.println(s1==s5); // False  (due to s1 is inside of scp and s5 is outside of scp both referes to different different object)
        System.out.println(s1==s6); // False  (due to s1 and s2 both refers to inside of scp but both refers to different object)

        System.out.println(s3==s4); // False  (due to  both refers to different different object)
        System.out.println(s3==s5); // False  (due to  both refers to different different object)
       

    }
}