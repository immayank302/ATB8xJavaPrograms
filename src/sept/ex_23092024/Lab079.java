package sept.ex_23092024;

public class Lab079 {
    public static void main(String[] args) {
        // Web Automation
        // I will ask user which browser you want me to run the code.
        // chrome -> execute chrome
        // firefox -> execute of firefox
        // edge -> edge cases.

        String browser = "Opera";
       // We can have the default at the top too

        switch (browser) {

            default:
                System.out.println("No idea which browser it is!");
                break;


            case "Chrome":
                System.out.println("Starting the chrome browser");
                break;

            case "Firefox":
                System.out.println("Starting the firefox browser");
                break;

            case "Edge":
                System.out.println("Starting the edge browser");
                break;


        }
    }
}
