package sept.ex_18092024;

public class Lab051 {
    public static void main(String[] args) {
        long phone_no=987654321;
      //  short s=phone_no; // Narrowing is not possible for the long data type to short
        short s=(short) phone_no;
        System.out.println(s);// There is observed a loss of the value




    }
}
