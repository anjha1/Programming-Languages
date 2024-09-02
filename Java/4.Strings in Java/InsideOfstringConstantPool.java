public class InsideOfstringConstantPool {

    public static void main(String[] args) {
        String sc1 = "anjha"; 
        String sc2 = "anjha";
        System.out.println(sc1==sc2);  // Due to inside of sce two reference (sc1,sc2) but one object is considerd
    }
}