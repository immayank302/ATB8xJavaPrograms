package assignments.oct.as_28102024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Function_Exercise1 {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Candy");
        list.add("Dates");
        list.add("Figs");
        list.add("Grapes");
        list.add("Horned Melon");


        System.out.println(list);
        System.out.println(list.size());

        list.set(1,"Avocados");
       // list.set(7,"Kiwis");  Gives the IndexOutOfBoundsException as the size is 7 and not 8.
        list.set(6,"Kiwis");
        System.out.println(list);

        System.out.println("To print ArrayList using the for-loop");
        for (int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("To Print ArrayList using enhanced for loop");
        for(Object o:list){
            System.out.println(o);
        }

        System.out.println("To print ArrayList using the Iterator method");
        Iterator<String> itr= list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
