package assignments.as_18092024;

public class PrePostIncrement2 {

    public static void main(String[] args) {

        int a = 10;
        System.out.println(  --a + a++ + a--);
        /*
        --a = 9
        a=9
        a++=10
        a=10
        a--=9
        Exp=9+9+10=28
         */

        System.out.println(a);//9
    }
}
