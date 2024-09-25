package assignments.as_20092024;

public class Handle_String_Grade {
    public static void main(String[] args) {

        int score = 95;

        // Using if-else statement
//        if (score>=90){
//            System.out.println('A');
//        } else if (score>=80) {
//            System.out.println('B');
//        }
//        else
//            System.out.println('C');
//    }

        // using ternary operator
        char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : 'C';
        System.out.println(grade);
    }
}