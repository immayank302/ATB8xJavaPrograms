package assignments.as_18092024;

public class ImplicitTypeCasting {

    public static void main(String[] args) {

        byte b=18;
        short a=b;
        System.out.println(a);//18

        short s=28;
        int i=s;
        System.out.println(i); // 28

        int n=45;
        float f=n;
        System.out.println(f);//45.0

        float ss=3456.32f;
        double d=ss;
        System.out.println(d);//3456.32


        long l=12345678123432l;
        double x=l;
        System.out.println(x);

    }
}
