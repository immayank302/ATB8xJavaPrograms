package assignments.oct.as_02102024;
//Create a Class  ATBStudent and 5 Objects - (A/B) - github.com
public class ATBStudent {

    String name;
    int admission_no;
    int roll_no;
    int class_name;
    char section;


    public static void main(String[] args) {
          ATBStudent atb=new ATBStudent();
          atb.name="Ram";
          System.out.println(atb.name); //Ram
          ATBStudent atb1=new ATBStudent();
          atb1.admission_no=43215;
          System.out.println(atb1.admission_no); //43215
          ATBStudent atb2=new ATBStudent();
          atb2.class_name=6;
          System.out.println(atb2.class_name); //6
          ATBStudent atb3=new ATBStudent();
          atb3.section='C';
          System.out.println(atb3.section);//C
          ATBStudent atb4=new ATBStudent();
          atb4.roll_no=42;
          System.out.println(atb4.roll_no);//42

    }
}
