package sept.ex_23092024;

public class Lab089 {
    public static void main(String[] args) {

        char c='A';
        switch (c){
            /*
            When we write case 'A' it automatically converts the 'A' to 65. So it will be
            case 65 :
                System.out.println("A");
                */
//            case 'A':
//                System.out.println("A");
//            break;
            case 65:   // In this program it wil give the error as duplicate case label
                System.out.println("65");
                break;
        }
    }
}
