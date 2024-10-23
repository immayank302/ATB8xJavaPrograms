package sept.ex_25092024;

import java.util.Scanner;

// How to take the user input from the keyboard
public class Lab114 {
    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
//         System.out.println("Enter the number : ");
//
//         int num=scanner.nextInt();
//         System.out.println("The number is : " + num);

        // To enter the string from the keyboard
        System.out.println("Enter the string : ");

        String s=scanner.next();
        System.out.println("The entered string is : " + s);
    }
}
