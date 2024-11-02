package oct.ex_28102024;


import java.util.List;

public class Lab198_List {
    public static void main(String[] args) {

      //  List list=new List();

        List list=List.of("banana","apple", "grapes", "orange"); // This method creates an unmodifiable list
        System.out.println(list.size());
       //  list.add("guava"); Gives an unsupportedoperationexception if we try to add any element
       // list.remove("orange"); Gives an unsupportedoperationexception if we try to add any element


    }
}
