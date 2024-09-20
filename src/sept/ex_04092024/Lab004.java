package sept.ex_04092024;

public class Lab004 {

    public static void main(String[] args) {

     try {
         int i=5/0;
     } catch (ArithmeticException e) {
         System.out.println("Arithmetic Exception");
     }
     finally{
         System.out.println("Finally block");
     }




    }
}
