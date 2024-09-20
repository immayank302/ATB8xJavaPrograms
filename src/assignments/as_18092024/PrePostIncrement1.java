package assignments.as_18092024;

public class PrePostIncrement1 {

    public static void main(String[] args) {

        int a = 10;
        System.out.println(--a + a --  + a--); // 9+9+8=26
        /*
           Line No |a | Exp
           7    |10 | a
           8   | 9 | --a
           8  | 9| a
           8 |8 | a--
           8 | 8| a
           8| 7 | a--
         */
        System.out.println(a);//7
    }
}
