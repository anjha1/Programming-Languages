public  class EqualsVsEquals{
    public static void main(String[] args) {
        String st ="anjha";
        String st1= new String("anjha");

        System.out.println(st==st1);  //("=") both refrense different different object to refers like st refers to inside of SCP and st1 refers to outside of scp


        System.out.println(st.equals(st1)); //(.equals)) both refrense same object value like(anjha and anjha is same value exist)
    }
}