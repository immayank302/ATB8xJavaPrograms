package assignments.oct.as_30102024;

import java.util.ListIterator;
import java.util.Vector;

public class PracticeVector {
    public static void main(String[] args) {

        Vector<Object> vector=new Vector<>();
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(2);
        vector.addElement(5);

        System.out.println(vector);
        //Insert Element at index 3
        vector.insertElementAt(4,3);
        vector.removeElement(5);

        //Print the elements of the vector
        for (Object o1:vector){
            System.out.print(o1 + " " );
        }
        System.out.println();
        vector.add("Mayank");
        vector.add("Singh");

        ListIterator<Object> literator= vector.listIterator();
        while (literator.hasNext()){
            System.out.println(literator.next());
        }
        System.out.println(vector.capacity());

    }

}
