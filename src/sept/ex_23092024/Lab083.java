// We can combine multiple cases together in a single statement
package sept.ex_23092024;

// We can execute multiple cases together in a single statement
public class Lab083 {

    public static void main(String[] args) {

        int itemcode = 007;

        switch (itemcode) {

            default:
                System.out.println("None");
                System.out.println("None");
                System.out.println("None");
                System.out.println("None");
                break;

            case 001, 002, 003:
                System.out.println("All of them are Electronic Gadgets");
                System.out.println("All of them are Electronic Gadgets");
                System.out.println("All of them are Electronic Gadgets");
                break;

            case 004, 005, 006:
                System.out.println("This is mech");
                System.out.println("This is mech");
                System.out.println("This is mech");
                break;


        }
    }
}

