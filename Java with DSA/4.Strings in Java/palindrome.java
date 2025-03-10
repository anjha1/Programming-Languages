public class palindrome{
    public static void main(String[] args) {
        String sc ="ana";
        
        String sc1="";
        for(int i=sc.length()-1;i>=0;i--){
            sc1=sc1+sc.charAt(i);
        }
        if(sc1.equals(sc)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}