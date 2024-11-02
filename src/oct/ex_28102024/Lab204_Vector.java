package oct.ex_28102024;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab204_Vector {
    public static void main(String[] args) {

        List list =new ArrayList();
        list.add("Pramod");
        list.add("Dutta");
        list.add("Singh");
        list.add("Mayank");
        list.add("Mayank");
        list.add("Mayank");
        list.add("Mayank");

        System.out.println(list);

        Vector v=new Vector();
        v.add("Mayank");
        v.add("Singh");
        v.add("apple");
        v.add("Orange");
        v.add("Orange");
        v.add("Orange");

        System.out.println(v);

        System.out.println(v.size());
        System.out.println(v.isEmpty());
        System.out.println(v.indexOf("Orange"));
        System.out.println(v.lastIndexOf("Orange"));
        System.out.print(v.contains("Mayank"));
    }
}
