package assignments.oct.as_30102024;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Function_Exercise {
    public static void main(String[] args) {

        LinkedList<String> llist=new LinkedList<String>();

        llist.add("Delhi");
        llist.add("Kolkata");
        llist.add("Mumbai");

        System.out.println(llist);

        System.out.println("After invoking the index method");

        llist.add(0,"New Delhi");

        System.out.println(llist);

        LinkedList<String> llist1=new LinkedList<String>();
        llist1.add("Bengaluru");
        llist1.add("Chennai");

        llist.addAll(llist1);

        System.out.println(llist);

        LinkedList<String> llist2=new LinkedList<String>();
        llist2.add("Hyderabad");
        llist2.add("Kochi");
        llist2.add("Ahmedabad");

        llist.addAll(llist2);

        System.out.println("To iterate using enhanced for loop");

        for (Object o:llist){
            System.out.println(o);
        }
        System.out.println(llist.removeLast());

        System.out.println("To iterate  using  Iterator method");

        Iterator<String> iterator=llist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        LinkedList<String> llist3=new LinkedList<>();
        llist3.add("11");
        llist3.add("12");
        llist3.add("13");
        llist3.add("Mumbai");
        llist3.add("Kochi");
        llist.addAll(llist3);
        llist.addLast("11");
     llist.remove(1);
        System.out.println("Iterating using the traditional for-loop");

        for (int i=0;i<llist.size();i++){
            System.out.println(llist.get(i));
        }




    }
}
