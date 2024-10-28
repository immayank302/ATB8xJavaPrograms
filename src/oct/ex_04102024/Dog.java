package oct.ex_04102024;

public class Dog {
      String name;
      int age;
      int legs;
      String breed;

      //Default Constructor
       Dog(){
           System.out.println("I am a default constructor");
           System.out.println("God is happy");
       }
        Dog(String breed){
           System.out.println("I am a parametrized constructor");
           this.breed=breed;

        }

        Dog(String breed,int age,int legs,String name){
           System.out.println("I am PC");
           this.breed=breed;
           this.name=name;
           this.age=age;
           this.legs=legs;

        }

        void  walk(){

        }
}
