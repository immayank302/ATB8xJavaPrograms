package assignments.oct.as_28102024;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_Function_Exercise {

    public static void main(String[] args) {

       List<Integer> list=new ArrayList<Integer>();
       list.add(12);
       list.add(23);
       list.add(24);
       list.add(45);
       list.add(46);
       list.add(85);

       System.out.println(list);

       System.out.println(list.size());
       System.out.println(list.get(0));
       System.out.println(list.getFirst());
       System.out.println(list.getLast());
       System.out.println(list.contains(24));

       System.out.println("----- To print ArrayList 1-------------");
       for (Object o:list){
           System.out.println(o);
       }

       System.out.println("--- To print ArrayList 2----");
       for(int i=0;i<list.size();i++){
           System.out.println(list.get(i));
       }

       System.out.println("--- To Print ArrayList 3 ----");
        ListIterator<Integer> listIterator= list.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
}
