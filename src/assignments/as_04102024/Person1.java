package assignments.as_04102024;

public class Person1 {
    public static void main(String[] args) {
        Person person=new Person();
        Person person1=new Person("Julius","Brad","Smith");
        Person person2=new Person("Male",26,"Graduate");
        Person person3=new Person(24356123,"slender",140991);
        Person person4=new Person("British");

        System.out.println(person1.fname);
        System.out.println(person1.mname);
        System.out.println(person1.lname);
        System.out.println(person2.gender);
        System.out.println(person2.age);
        System.out.println(person2.qualification);
        System.out.println(person3.aadharno);
        System.out.println(person3.height);
        System.out.println(person3.date_of_birth);
        System.out.println(person4.nationality);

        System.out.println(person1.read("Male"));
        person2.eat(25);
        person3.sleep();


    }
}
