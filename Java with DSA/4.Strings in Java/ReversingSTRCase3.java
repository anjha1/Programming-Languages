public class ReversingSTRCase3 {
    public static void main(String[] args) {
        String sc = "pwskill java"; //(na ahj)
        String sc1="";
        
        for(int i=sc.length()-1;i>=0;i--){
            sc1=sc1+sc.charAt(i);
            
        }
        System.out.println(sc1);
        String sc2 []= sc1.split(" ");
        String sc3="";
        for(int j=sc2.length-1;j>=0;j--){
            sc3=sc3+sc2[j]+" ";
            
        }
        System.out.println(sc3);
        
    }
}
