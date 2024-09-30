package assignments.as_27092024;

public class ExampleWhileDoWhile {

    public static void main(String[] args) {

        // In the while loop first the condition will be verified and then the loop will be executed

        int num=10;
        while (num>=1){

           System.out.println(num);

            num--;
        }
        System.out.println("While loop executed");

  // In the do-while loop the statements will be executed and then the condition will be verified

        int num1=0;
        do {
            System.out.println("Hello World");

            num1++;

        }while(num1<0);



    }
}
