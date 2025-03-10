
import java.util.Arrays;
public  class Anagram{
    public static void main(String[] args) {
       String sc="school master";
       String sc1="the classroom";
       String sc2="";
       String sc3="";
        
        for(int i=0;i<sc.length();i++){
            if (sc.charAt(i)==' ' && sc1.charAt(i)==' '){
                continue;
            }
            else{
                sc2=sc2+sc.charAt(i);
                sc3=sc3+sc1.charAt(i);
            } 
        }
        if(sc2.length()==sc3.length()){
            char sc4 [] = sc2.toCharArray();
            char sc5 [] = sc3.toCharArray();
            Arrays.sort(sc4);
            Arrays.sort(sc5);
            String sc6="";
            String sc7="";

            for(char i:sc4){
                sc6=sc6+i;
            }
            for(char j:sc5){
                sc7=sc7+j;
            }

            if(sc6.equals(sc7)){
                System.out.println("Anagram");
            }
            else{
                System.out.println("not a Anagram");
            }

        }
        else{
            System.out.println("not a Anagram");
        }
        
    }
}