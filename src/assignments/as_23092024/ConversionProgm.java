package assignments.as_23092024;

public class ConversionProgm {

    public static void main(String[] args) {

        int kilomtr=5;
        int mtr;
        double celsius=35;
        double fahrenheit;
        int choice=4;
        switch (choice) {

            case 1 :
                mtr=kilomtr*1000;
                System.out.println("Kilometer to meter conversion gives the output in terms of meter is " + + mtr);
                break;

            case 2:
                /*
               fahrenheit=(9celsius/5)+32
                 */
                fahrenheit=(9*celsius/5)+32;
                System.out.println("Fahrenheit temperature is : " + fahrenheit);
                break;

            default:
                System.out.println("No conversion possible based on the user input");
                break;
        }
          System.out.println("Came out of the switch statement");

    }
}
