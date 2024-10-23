package sept.ex_25092024;

public class Lab097 {
    public static void main(String[] args) {
//
//        final boolean b1=true;
//       // b1=false; // We can't assign the value to false as the b1 is final and the value once assigned can't be modified
//       for (int i=0;b1;i++){  // It will print the infinite loop as the condition will always be true
//           System.out.println("Hello");
//       }
//       for(int i=0; ;){
//           System.out.println("Hello");  // No condition & no increment/decrement is provided. It will print the infinite loop
//       }
        for(;  ;) {  //no initialization, no condition , no increment/decrement is there. It will print the infinite loop
            System.out.println("Hello");
        }
    }
}
