package assignments.oct.as_04102024;

public class Person {

      String fname;
      String mname;
      String lname;
      String gender;
      int age;
      long aadharno;
      String qualification;
      String height;
      int date_of_birth;
      String  nationality;

      Person(){
          System.out.println("I am a default constructor");
      }

      Person(String fname, String mname, String lname){
          System.out.println("I am a parameterized constructor");
          this.fname=fname;
          this.mname=mname;
          this.lname=lname;
      }

      Person(String gender, int age, String qualification){
          System.out.println("I am a parametrized constructor with attributes");
          this.gender=gender;
          this.age=age;
          this.qualification=qualification;
      }

      Person(long aadharno, String height, int date_of_birth){
          System.out.println("I am a parametrized constructor with 3 attributes");
          this.aadharno=aadharno;
          this.height=height;
          this.date_of_birth=date_of_birth;
      }

      Person(String nationality){
          System.out.println("I am a parametrized constructor with single attribute");
          this.nationality=nationality;
      }


      // B - Behaviour - Methods

      public void talk(){
          System.out.println("It can talk");
      }

      public int walk(){
          return 10;
      }

      public void eat(int age){

          System.out.println("Vegan");

      }
    public String read(String gender){
          this.gender=gender;
          System.out.println("Gender is : " + gender);
          return "Reading";
    }
    public void  sleep(){
          System.out.println("Sleeping");
    }
}
