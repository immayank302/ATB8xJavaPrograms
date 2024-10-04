//Another byte b = 10; byte c = 10;  What is the anwser if the perform b+c,
// What is the data type it will give in result.
package sept.ex_18092024;

public class Lab047 {

    public static void main(String[] args) {

        byte b=10;
        byte c=10;

       // byte d=b+c;// If the user performs b+c then the answer will not be stored in the byte. It will give the error
                     // as expected int found byte.

        int res=b+c;

        System.out.println(res); //20

    }
}
