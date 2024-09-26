package assignments.as_25092024;

public class PrintTable {

    public static void main(String[] args) {

        int num = 10;

      /* Using for-loop
        for(int i=1;i<=10;i++){
             int value=num*i;
             System.out.printf("%d X %d=%d",num,i,value);
             System.out.println();

        }
        */
//     Using while loop
        int i = 1;
        while (i <= 10) {

            int value = num * i;
            System.out.printf("%d X %d=%d", num, i, value);
            System.out.println();

            i++;


        }
    }
}
