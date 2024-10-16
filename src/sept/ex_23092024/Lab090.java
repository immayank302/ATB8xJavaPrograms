package sept.ex_23092024;

public class Lab090 {

    public static void main(String[] args) {

       // char c='A';
        int c=65;
        switch (c){
            case 'A'+1:  //We can also write like this as case 'A'+1 will correspond to case 66 as the value of the A is 65.
                System.out.println("B");
                break;
            case 'A':
                System.out.println("A");
                break;
            case 'A'+2: // 'A'+2 will correspond to 67
                System.out.println("C");
                break;
        }
    }
}
