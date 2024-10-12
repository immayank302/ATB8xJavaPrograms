package sept.ex_18092024;

public class Lab061 {
    public static void main(String[] args) {
        int a=10;
        int result=--a;
        System.out.println(result);//9
        System.out.println(a); // 9

        int result1=--a - a-- - --a;
        System.out.println(result1); // 8-8-6 =-6
        // A=--a , B=a--, C=--a
        // Line No. | Exp | a
        // 8 | NA | 9
        // 10 | A=8 | 8
        // 10 | B=8 | 7
        // 10 | C=6 | 6
        System.out.println(a); //6

    }
}
