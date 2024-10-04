/*
short s = 10;

        char c = 'A'; //65

        int ss = s+c;

        System.out.println(ss);
 */
package sept.ex_18092024;

public class Lab049 {

    public static void main(String[] args) {

        short s = 10;

        char c = 'A'; //ASCII value for the letter capital A is 65

        int ss = s+c;
        System.out.println(ss);//75
        char c1='a'; //97
        System.out.println(s+c1); // It will take the s value and the ASCII value of c1 and do the sum of both of them
    }
}
