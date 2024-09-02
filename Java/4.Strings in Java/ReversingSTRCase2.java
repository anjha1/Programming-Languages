public class ReversingSTRCase2 {
    public static void main(String[] args) {
        String sc = "an jha";
        String sc1="";
        String sc2 []= sc.split(" ");
        
        for(int i=sc2.length-1;i>=0;i--){
            sc1=sc1+sc2[i]+" "; 
        }
        System.out.println(sc1);
    }
}
