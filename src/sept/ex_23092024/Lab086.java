// What will be the output of the below program
package sept.ex_23092024;

public class Lab086 {
    public static void main(String[] args) {

        int a = 11;

        switch (-1) {   // This is possible , as the value is given to trick us.

            default:
                System.out.println("Default");
                break;

            case -1:
                System.out.println("10");
                break;

            case 9:
                System.out.println("9");
                break;

        }
    }
}
