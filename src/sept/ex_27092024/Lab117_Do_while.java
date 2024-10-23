package sept.ex_27092024;

public class Lab117_Do_while {

    public static void main(String[] args) {

        int a=0;
        do {
            System.out.println("Print --> " + a);
            a++;
        }while(a<0);
    }
}
//This program will execute the body once. It will print the statement print --> 0.
// But when the condition is checked it will always be false.