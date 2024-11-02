package oct.ex_28102024;

import java.util.*;

public class Lab198_List_ArrayList {
    public static void main(String[] args) {

       // List list=new List();

        List list=new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println(list); // [1,2,3,4,5]

        System.out.println(list.size()); // 5

        System.out.println(list.isEmpty()); // false
        System.out.println(list.contains(1)); // false
        System.out.println(list.contains("1")); //true
        System.out.println(list.indexOf("3")); //3
        System.out.println(list.lastIndexOf("3")); //3



    }
}
