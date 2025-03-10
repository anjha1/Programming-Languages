public class OutOfStringConstantPoolAndInsideOfJvm {
    public static void main(String[] args) {
        String sc1= new String("anjha");
        String sc2 = new String("anjha");
        System.out.println(sc1==sc2);  // Due to outside of sce and inside of jvm two reference (sc1,sc2) both are different different object is considerd
    }
}
