package oct.ex_28102024;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Lab199_List_ArrayList {
    public static void main(String[] args) {

        List list=new ArrayList();

        list.add("bread");
        list.add("butter");
        list.add("milk");
        list.add("paneer");
        list.add("cheese");
        list.add("jam");

        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.isEmpty());
        System.out.println(list.contains(1));
        System.out.println(list.indexOf("3")); // Returns -1 if the list doesnot contain specified element
        System.out.println(list.lastIndexOf("3")); // Returns -1
        System.out.println(list.indexOf("jam"));
    }
}
