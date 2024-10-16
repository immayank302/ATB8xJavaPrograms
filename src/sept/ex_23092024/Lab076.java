package sept.ex_23092024;
// Switch Condition
public class Lab076 {
    public static void main(String[] args) {
          // without using the break keyword it will execute all the statements till it didn't find the break keyword.
        int day=8;
        switch (day){

            case 1:
                System.out.println("Monday");

            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wednesday");

            case 4:
                System.out.println("Thursday");

            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No idea, what it is !");
                break;
        }

        System.out.println("End of the switch statement");
    }
}
