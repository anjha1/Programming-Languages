public class young {
    public static void main(String[] args) {
        int age = 19;
        if (age>18 && age <20){
            System.out.println("YOUNG");
        }
        else if (age>20 && age <30){
            System.out.println("MIDDLE");
        }
        else if (age>30 && age <40){
            System.out.println("OLD");
        }
        else if (age<18 && age >1){
            System.out.println("CHILD");
        }
        else {
            System.out.println("INVALID");
        }
    }
}
