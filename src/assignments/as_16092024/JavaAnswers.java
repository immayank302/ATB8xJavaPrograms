package assignments.as_16092024;

public class JavaAnswers {

    public static void main(String[] args) {

        //Difference between = and  ==
/*
        == - It is the Relational Operator. It is used to  compare whether the 2 operands are equal or not. On comparison
        it will return either true or false.
        = - It is an Assignment Operator. It is used to assign the value on the right to the variable on the left.
*/
     /* byte b = 10; long l = 10l; → How much Byte will be used.
        byte b = 10 ; // 1 byte
        long l=10l  //  8 bytes
        Total byte is (1+8=9). 9 bytes will be used.
      */
 // Another byte b = 10; byte c = 10;  What is the anwser if the perform b+c, What is the data type it will
        // give in result.

        byte b=10;
        byte c=10;
        System.out.println(b+c);//20
    }
}
