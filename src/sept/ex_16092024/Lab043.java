// Can you tell the output of the following program
package sept.ex_16092024;

public class Lab043 {

    public static void main(String[] args) {

        int a=12;

        boolean b=!(a>10 || a<5);
        // follows the principle of the BODMAS
        // In the above it will compute the bracket where it compares the True || false and the result will be
        // true and then !true where it will become false
        System.out.println(b);
    }
}
