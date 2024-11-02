package oct.ex_28102024;

import java.util.ArrayList;
import java.util.List;

public class Lab202_ArrayList {
    public static void main(String[] args) {

      //  List<int> l=new ArrayList<int>();
        // type argument cannot be of int type
          List<Integer> list=new ArrayList<Integer>();

          list.add(123);

          List<String> l=new ArrayList<String>();
          l.add("Pramod");
         // l.add(123);// Once declared as String type we can't declare this using int
          l.add(String.valueOf(123));
          System.out.println(l);

    }
}
