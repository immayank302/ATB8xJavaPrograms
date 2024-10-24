package sept.ex_30092024;

public class Lab121 {
    public static void main(String[] args) {


        // Parameters is also known as arguments


        //  1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type


    // greet(); // It will only return once.
        for (int i = 0; i < 10; i++) {
            greet();  // It will print Hi - 10 times
        }

    }
    // Define
    // No Return type and no arguments
    // 1. Without parameters and without return type
   // In the below method we are not returning anything by providing the return type as void
    public static void greet(){
        System.out.println("Hi");
    }
}
