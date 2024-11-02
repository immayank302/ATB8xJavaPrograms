package oct.ex_28102024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab203_ArrayList_Iterate {
    public static void main(String[] args) {

        List<String> myList=new ArrayList<String>();
        myList.add("Pramod");
        myList.add("Amit");
        myList.add("Dutta");

        System.out.println(myList);

        System.out.println("Print Array List -- 1");
        for (String str: myList){
            System.out.println(str);
        }
        System.out.println("Print Array List --2 ");
        for(int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }
        System.out.println("Print Array List -- 3");

        Iterator<String> iterator=myList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
