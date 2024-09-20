package assignments.as_18092024;

public class PrePostIncrement2 {

    public static void main(String[] args) {

        int a = 10;
        System.out.println(  --a + a++ + a--); // 9+9+10=28
        /*
         Line No | a | Exp
         7       |10| NA
         8       |9| --a
         8       |9| a++
         8       |10| a after postincrement(a++)
         8       |10| a
         8       |9| a after postdecrement(a--)
         8       |9| a
         */

        System.out.println(a);//9
    }
}
