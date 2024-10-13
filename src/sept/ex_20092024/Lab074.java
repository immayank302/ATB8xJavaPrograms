package sept.ex_20092024;
// Grade Calculator
 // Write a program that calculates and displays
        //        the letter grade for a given numerical
        //        score (e.g., A, B, C, D, or F)
        //        based on the following grading scale:
        //        A: 90-100
        //        B: 80-89
        //        C: 70-79
        //        D: 60-69
        //        F: 0-59

public class Lab074 {
    public static void main(String[] args) {
        char grade='F';
        int score=101;

        if(score>=90 && score<=100){
            grade='A';
            
        } else if (score>=80 && score<=89) {
            grade='B';
        } else if (score>=70 && score<=79) {
            grade='C';
        } else if (score>=60 && score<=69) {
            grade='D';
        } else if (score<=0 || score>100) {
            System.out.println("Wonderful ! You are amazing");
            grade='O';
        } else {
            grade='F';
        }

        System.out.println("Displayed grade as per the marks is : " + grade);



    }
    }

