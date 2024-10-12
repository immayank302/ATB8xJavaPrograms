package sept.ex_18092024;

public class Lab059 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a + a++ + a++); //11+11+12=34
        // A=++a, B=a++ , C=a++
        // Line No.|Exp | a
        // 5 |NA| 10
        // 6 |A=11| 11
        // 6 | B=11| 12
        // 6 | C=12 | 13
        System.out.println(a); //13

    }
}
