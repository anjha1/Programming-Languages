public class mutable_VS_Immutable{
    public static void main(String[] args) {
        String st = "My Name Is Anjha";
        System.out.println(st);

        st.concat("And Jhunnu");
        System.out.println(st);


        StringBuilder st1 = new StringBuilder("My Name Is Anjha");
        System.out.println(st1);

        st1.append(" And Jhunnu.");
        System.out.println(st1);





    }
}