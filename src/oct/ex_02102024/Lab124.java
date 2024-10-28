package oct.ex_02102024;

public class Lab124 {
    public static void main(String[] args) {

        // Class - Blueprint to create objects.
        // Objects - Instances of the class - created from the class

        ATBStudent amit=new ATBStudent();

        ATBStudent pramod=new ATBStudent();

         // Prints the memory location

        System.out.println(amit);
        System.out.println(pramod);

       int a= amit.age=35;
       int b= pramod.age=45;
        System.out.println(a);
        System.out.println(b);

    }
}
