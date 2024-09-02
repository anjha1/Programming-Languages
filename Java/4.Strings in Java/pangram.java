
import java.util.Arrays;





public class pangram{
    public static void main(String[] args) {
       String st="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String st1="MNOPQR STUVWXY ABCDE FGHIJ KLZ";
       String st3="";
    boolean[] seen = new boolean[128];
        for(int i=0;i<st1.length();i++){
            if(st1.charAt(i)==' '){
                continue;
            }
            else{
                st3=st3+st1.charAt(i);
                st3=st3.toUpperCase();
                
                
            }  
        }
        String st8="";
        char st4 []=st3.toCharArray();
        Arrays.sort(st4);
    
        for(int j=0;j<st4.length;j++){
            st8=st8+st4[j];
            
   
        }

        
        if(st8.contains(st)){
            System.out.println("pangram");
        }
        else{
            System.out.println("Not a pangram");
            System.out.println(st8);

        }
      
        }
         


        
    }
