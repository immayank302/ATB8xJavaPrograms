package sept.ex_13092024;

public class Lab024 {

    public static void main(String[] args) {

        // Single Character
           char c1='c';
           char c2='a';
           char c3='b';

           //Escape Character

        char new_line='\n';
        char create_tab='\t';
        char  back_space='\b';
        char car_r='\r';

        System.out.println("Mayank" + new_line + "Singh"); // Terminates the fist line and moves the next word to next line
        System.out.println("Mayank" + '\n' + "Singh");
        System.out.println("Mayank" +  create_tab + "Singh"); //Make extra space between two words
        System.out.println("Mayank" + back_space + "Singh");//Removes the last letter of the first word
        System.out.println("Mayank" + car_r + "Singh"); //Removes the first word

        char c11='\u1F60';
        System.out.println(c11);





    }
}
