package assignments.as_18092024;

public class ExplicitTypeCasting {

    public static void main(String[] args) {

        int a=25;

        byte b=(byte)a;
        System.out.println(b);//25

        float f=18.5f;
        int i=(int) f;
        System.out.println(i);//18

        double d=2443567.8345678;
        long l=(long)d;
        System.out.println(l);//2443567

        char c='E';
        int x=(int) c;
        System.out.println(x);// It will print the ASCII value of E

        float s=3456.32f;
        long dd=(long)s;
        System.out.println(dd);//3456
    }
}
