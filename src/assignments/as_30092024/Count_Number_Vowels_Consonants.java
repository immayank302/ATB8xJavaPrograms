package assignments.as_30092024;

public class Count_Number_Vowels_Consonants {

    public static void main(String[] args) {

  String str="pramod";
  int len=str.length();
  int vowel_count=0;
  int conso_count=0;
    String vowel=" ";
   // char consonant;
  for (int i=0;i<len;i++){
       if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
               vowel_count++;
               vowel=vowel+str.charAt(i);
      }
       else{
           conso_count++;
      }


  }
        System.out.println("Vowels : " + vowel);
        System.out.println("The vowel count is : " + vowel_count);
        System.out.println("The vowel count is : " + conso_count);
    }
}
