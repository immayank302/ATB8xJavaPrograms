package sept.ex_23092024;

public class Lab087 {
    public static void main(String[] args) {

        char code='C';
        switch (code){

            default:
                System.out.println("Heloo!");
                break;
            case 'A':
                // We can also write the case 65 as the jvm will basically take this as case 65 . The ASCII value of A is 65
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;


        }


    }
}
