package sept.ex_18092024;

public class Lab050 {

    public static void main(String[] args) {
            //Type Casting
        // Widening - Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit(with data type), loss

        //Widening
        byte b=10;
        int  num=(int)b;
        System.out.println(num);


        //Narrowing
        int a1=100;
       // byte c=a1; //Not possible
        byte c=(byte)a1;
        System.out.println(c);




    }
}
