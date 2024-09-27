package assignments.as_25092024;

public class Factorial_of_Number {

    public static void main(String[] args) {

        //Factorial of 5 is calculated as 5X4X3X2X1=120

        // Using while loop
        int result=1;

        int num=3;

        while (num>0){
               result=num*result;
         //   System.out.println(result);
               num--;
         //     System.out.println(num);

        }

        System.out.println("Factorial of the number is : " + result);





    }
}
