package sept.ex_18092024;

public class Lab053 {
    public static void main(String[] args) {

        // Increment (++) and Decrement (--) Operator
        // Pre and Post

        // pre-increment -- Value is incremented first and then it is stored in the result
          int a=10;
          int b=++a;  // b=a+1
        //Here the value of the a is incremented first and then stored in the variable b
        System.out.println(b);//11

        System.out.println(++a); // 12

        //Post-Increment -- First print and then increment
        int a_post=10;
        System.out.println(a_post++); //10
        System.out.println(a_post);//11


    }
}
