//✅ By using Ternary Operators max between 3 numbers.
// Input int - a,b,c - a = 10, b = 20, c = 45
// Max → a,b,c → c

package assignments.as_20092024;

public class Max_Btw_3_Nos {

    public static void main(String[] args) {

        int a=10;
        int b=20;
        int c=45;

  // Using logical operator
//  int greatest = (a>b && a>c)?a: (b>a && b>c)?b:c;
//        System.out.println("Maximum among 3 numbers is : " + greatest);

 //Without using logical operator
 int greatest = (a>b)?(a>c?a:c):(b>c)?b:c;
 System.out.println("Maximum among three numbers is  : " + greatest);


    }
}
