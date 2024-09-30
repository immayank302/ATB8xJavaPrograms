package assignments.as_27092024;
// Create a Java program that prints the first 5 even numbers using a do-while loop.
public class First_5_Even_Numbers {

    public static void main(String[] args) {
           int num1=0;
           int count =0;
           do {
                if(num1%2==0){
                    count++;
                        if(count==5){
                            break;
                        }
                        System.out.println(num1);
                }

                num1++;
           }while (num1<=10);

    }
}
