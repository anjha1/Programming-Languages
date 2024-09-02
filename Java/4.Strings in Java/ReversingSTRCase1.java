public class ReversingSTRCase1 {
    public static void main(String[] args) {
        String sc = "anjha";
        String sc1="";
        
        for(int i=sc.length()-1;i>=0;i--){
            sc1=sc1+sc.charAt(i);
            
        }
        System.out.print(sc1);
    }
}
