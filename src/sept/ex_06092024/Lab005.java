package sept.ex_06092024;
//Can main method be overloaded
//But JVM looks for the main method with the correct signature.
public class Lab005 {

    public static void main(String[] args) {
        System.out.println("Hello World");

    }

    public  static  void main(String args){
        System.out.println("Overloaded  main method");
    }

    public void main(int args){
        System.out.println("Hello World -- I m there");
    }


}