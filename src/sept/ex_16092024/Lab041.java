package sept.ex_16092024;

public class Lab041 {
    public static void main(String[] args) {

        boolean a=true;
        System.out.println(!a); //false
        System.out.println(!(10>20)); //true
        System.out.println(!!!!(30>90)); //30>90-->false ,!false-->true, !true-->false,!false-->true, !true-->false
      //  System.out.println((30>90)!); //will give  the error as ')' or ',' expected.

    }
}
