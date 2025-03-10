public class UpperVSLower2{
    public static void main(String[] args) {
        String s1="anjha";
        String s2="anjha";

        String s3= new String("anjha");
        String s4= new String("anjha");

        String s5= new String("ANJHA");
      

        String s6="ANJHA";

        System.out.println(s1.equals(s2)); // True 
        System.out.println(s1.equals(s3)); // True  
        System.out.println(s1.equalsIgnoreCase(s6)); // True  
        System.out.println(s1.equalsIgnoreCase(s6)); // True  
        System.out.println(s3.equals(s2)); // True  
        System.out.println(s3.equals(s4)); // True  
        System.out.println(s3.equalsIgnoreCase(s5)); // True  
       
    }
}