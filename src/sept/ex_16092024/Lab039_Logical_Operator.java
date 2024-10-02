package sept.ex_16092024;

public class Lab039_Logical_Operator {

    public static void main(String[] args) {

        // && -- logical And
        // || -- logical OR
        // ! --  logical Not

        boolean a=true;
        boolean b=false;

        boolean c=(a && b);
        System.out.println(c); // false

        boolean d=(a||b);
        System.out.println(d); //true

        System.out.println(!d);// false
        System.out.println(!c); // true


    }
}
