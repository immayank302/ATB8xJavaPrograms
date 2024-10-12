package sept.ex_18092024;

public class Lab057 {
    public static void main(String[] args) {
        int a=10;
    System.out.println(a++ + ++a); //22
    // A --> a++
    // B --> ++a
    //  Line No.|Exp| a
    // 5 | NA| 10
    // 6 | A =10 | 11
    // 6 | B=12 | 12
    System.out.println(a); //12

    }
}
