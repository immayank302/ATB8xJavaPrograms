package assignments.oct.as_28102024;

public class differences_collections_framework {

    /*
    Difference between arraylist and linked list
             Array List                                                        Linked List
   In terms of storing the elements                                      In terms of storing the elements
      ArrayList uses dynamic arrays to store the elements                LinkedList uses doubly linked list to store the elements
    In terms of manipulation                                             In terms of manipulation
       Arraylist is slower as it internally uses the arrays to           LinkedList is faster as it uses a doubly linked list
       store the element                                                 so bit shifting is required in the memory
     In terms of usage                                                   In terms of usage
     ArrayList is better for storing and accessing elements               LinkedList is better for manipulating data.
     ArrayList class can act as List interface.                           LinkedList class can act as both list and queue as it
                                                                          implements both list and deque interfaces.

      Difference between List and Set
       List                                                                 Set
       List is an interface present in the java.util package               Set is an interface
      1).List contains different classes like                            1).Set contains the different classes like
       ArrayList, LinkedList, Vector & Stack                              EnumSet, HashSet,LinkedHashSet, TreeSet
      2).We can able to store the same or duplicate elements             2).Set doesn't give us the provision to store the same or
       by using the list                                                 duplicate elements.
     3). Insertion order is maintained by the list                      3). Insertion order is not maintained by the set.
     4). List allows us to add any number of null values                4). Set allows us to add at least 1 null value in it.
     5). We can get the specified element of the list by                5). We cannot find the element from the Set based on the
     using the get() method.                                              index because it doesn't provides any get() method.
     6). It is used when we want to frequently access the              6). It is used when we want to design a collection of
     elements by using the index.                                         distinct elements.
     */
}
