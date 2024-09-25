package assignments.as_23092024;

public class PrintMonth {
    public static void main(String[] args) {

        int month=5;
        switch (month) {

            case 1 :
                System.out.println("It is January month");
            break;
            case 2 :
                System.out.println("It is February month");
            break;
            case 3 :
                System.out.println("It is March month");
            break;
            case 4 :
                System.out.println("It is April month");
            break;
            case 5 :
                System.out.println("It is May month");
            break;
            case 6 :
                System.out.println("It is June month");
            break;
            case 7 :
                System.out.println("It is July month");
            break;
            case 8 :
                System.out.println("It is August month");
            break;
            case 9 :
                System.out.println("It is September month");
            break;
            case 10 :
                System.out.println("It is October month");
            break;
            case 11 :
                System.out.println("It is November month");
            break;
            case 12 :
                System.out.println("It is December month");
                break;
            default:
                System.out.println("No idea which month it is");
                break;
        }
         System.out.println("Out of switch statement");
    }
}
