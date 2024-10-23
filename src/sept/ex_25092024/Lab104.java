package sept.ex_25092024;
// What will be the output of the following program
public class Lab104 {
    public static void main(String[] args) {

     for (int i=0;i<10;i++){
           if(i==5){
               System.out.println("Five");
           }
           else {
               System.out.println(i);
           }
     }
     // It will check the condition till 0 to 4 and will print the numbers. If i==5 it will print the string Five. It will then
        // increment  and then print the numbers from 6 to 9. It will not print 10 as 10 is not less than 10.
    }
}
