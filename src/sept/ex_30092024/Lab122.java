package sept.ex_30092024;

public class Lab122 {
    public static void main(String[] args) {
       function_type1();
   String name=function_type2();
   System.out.println(name);
   function_type3(12,"Test","Mayank",18);
   String s=function_type4("Java","JDK");
   System.out.println(s);

    }
    // 1. Without parameters and without return type
      public static  void function_type1(){
          System.out.println("1.Without Parameters and Without Return Type");
      }
   // 2. Without parameters and with return type
     public static  String function_type2(){
          System.out.println("2. Without parameters and with return type");
          return "Pramod";
     }
     // 3. With Parameters and Without Return Type
      public  static  void function_type3(int age, String name, String fname, int age2){
        System.out.println("3. With Parameters and Without Return Type");
        System.out.println("Value is : " + fname);
      }
     // 4. With Parameters and with Return type
     public static  String function_type4(String a, String b){
        System.out.println("4. With Parameters and with Return type");
        System.out.println("The value is " + a + b);
        return "Hello";
     }








}
