package sept.ex_18092024;

public class Lab052 {
    public static void main(String[] args) {
        int course=100;
        float GST=18.45f;
//
//        float total_price=course+GST; //Widening is possible and there should not be in any loss of the data
//        System.out.println(total_price); // 118.45f

        //int total_price=course+GST;  //Narrowing of the float to int will give you the warning;
        int total_price=course+(int)GST;
        System.out.println(total_price); //118
        //There is a loss of the data observed for the above statement.



    }
}
