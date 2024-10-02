// can you tell the output of the following program
package sept.ex_16092024;

public class Lab042 {
    public static void main(String[] args) {
        // || - OR operator
        // 1 -- true , 0 -- false
        /*
            1 || 0 = true
            0 || 1 = true
            0 || 0 = false
            1 || 1 = true

            1 && 1 = true
            1 && 0 = false
            0 && 1 = false
            0 && 0 = false

         */
        System.out.println(true || false); // true
        System.out.println(false || true); //true
        System.out.println(false || false); // false
        System.out.println(true || true);  // true

        System.out.println(true && false);  // false
        System.out.println(false && true);  // false
        System.out.println(false && false); // false
        System.out.println(true && true);  // true

    }

}
