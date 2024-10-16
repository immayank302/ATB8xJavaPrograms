package sept.ex_23092024;
 // In JDK 13 Java introduced a new switch statement syntax where we can use the -> to eliminate the use of the break statement.
// We can combine multiple case labels for the same result using commas.
// We can't use the multiple print statements together . Only single line is allowed
public class Lab084 {
    public static void main(String[] args) {

        int itemcode=004;

        switch (itemcode){
            case 001->System.out.println("It's a laptop");
            case 002->System.out.println("It's a desktop");
            case 003->System.out.println("It's a mobile");

                default -> System.out.println("Heloo!");






        }
    }
}
