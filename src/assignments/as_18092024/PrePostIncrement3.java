package assignments.as_18092024;

public class PrePostIncrement3 {

    public static void main(String[] args) {

        int a = 10;
        System.out.println(  a-- + a --  + a --); //10+9+8=27
        /*
          Line No |a | Exp
          7      |10 | a
          8      |10 | a
          8      |9 | Value after decrement (a--)
          8     |9 | a
          8     |8 | Value after decrement (a--)
          8    |8| a
          8    | 7| a--
          8    |7| a
         */
        System.out.println(a);//7
    }
}
