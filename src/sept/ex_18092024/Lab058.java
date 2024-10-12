package sept.ex_18092024;

public class Lab058 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a + ++a); // 11+12=23
        //Line No. | Exp | a
        // A = ++a, B=++a;
        // 5 |NA| 10
        // 6 |A=11| 11
        // 6 |B=12 | 12
      System.out.println(a);  // 12
        }
}
