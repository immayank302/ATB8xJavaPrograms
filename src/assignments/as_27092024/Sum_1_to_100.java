package assignments.as_27092024;
//Write a Java program that calculates the sum of numbers from 1 to 100 using a while loop.
public class Sum_1_to_100 {
    public static void main(String[] args) {
          int number=1;

          int sum=0;
   //  Using while loop
          while (number<=100){

              sum=sum+number;
              number++;
          }
        System.out.println("The sum using while loop is  : " + sum);

  // Using do-while loop
        int number1=1;

        int sum1=0;
          do {

              sum1=sum1+number1;
            number1++;
          }while (number1<=100);
     System.out.println("The sum using do-while loop is : " + sum1);

     // Using for loop
        int sum2=0;
        for (int number2=1;number2<=100;number2++){
            sum2=sum2+number2;
        }
        System.out.println("Sum of the numbers  using for loop is : " + sum2);

    }
}
