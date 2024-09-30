package assignments.as_27092024;
// Create a Java program that prints the first 5 even numbers using a do-while loop.
public class First_5_Even_Numbers {

    public static void main(String[] args) {
           int num1=1;
           int a =0; //Count of the numbers
           do {
                if(num1%2==0){
                    System.out.println(num1);
                   a++;
                        if(a ==5){ // if count of the number is 5 then it will break & come out of the loop
                            break;
                        }

                }

                num1++;
           }while (num1<=10);

    }
}
