package assignments.as_25092024;

import java.util.Scanner;

public class Factorial_N_Number {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number to perform the factorial : ");

        int num= sc.nextInt();
        System.out.println("The entered number is : " + num);

        int res=1; // Result to be intialized to 1

      /* Using do-while loop
      do {
            res=res*num;
            num--;
        }while (num>0);
        */

// Using for-loop

        for (;num>0;num--){
             res=res*num;

        }

        System.out.println("The factorial of the entered number is : " + res);
    }
}
