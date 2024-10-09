package assignments.as_30092024;

import java.util.Scanner;

public class Factorial_N_Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
  // Using while loop
        int result = 1;
      /*
      while (num > 0) {
            result = num * result;
            num--;
        }
        */

       /* Using do-while loop
        do {
            result=num*result;
            num--;
        }while (num>0);
        */
        // Using for-loop
        for (;num>0;num--){
            result=num*result;

        }

        System.out.println("The factorial is : " + result);

    }
}
