package oct.ex_04102024;

public class AHuman {

    String eye_color;
    String planet = "AHuman";
    String name;
    long aadhar_number;

    //Default Constructor

    AHuman() {
        System.out.println("I am a default constructor");
        System.out.println("I will be called when Object is created");
    }

    // Parameterized Constructor

    AHuman(String name) {
        System.out.println("I am a parametrized constructor");
        this.name = name;
    }

    void walk() {
        System.out.println("NRNA");
    }

    int talk() {
        System.out.println("RTNA");
        return 10;
    }

    void eat(String name) {
        System.out.println("NRWA");
        System.out.println("Eat");
    }

     String sleep(String name){
           System.out.println("Sleeping");
           System.out.println("RTWA");
           return "I am sleeping";
     }
}





