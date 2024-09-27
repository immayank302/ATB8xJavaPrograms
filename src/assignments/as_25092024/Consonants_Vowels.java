package assignments.as_25092024;

public class Consonants_Vowels {

    public static void main(String[] args) {
        String str="pramod";

        int vowel_count=0;
        int consonant_count=0;

        for (int i=0;i<str.length();i++){
                  if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                      System.out.println(str.charAt(i));
                       vowel_count++;
                  }

                  else{
                     // System.out.println(str.charAt(i));
                      consonant_count++;
                  }
        }

        System.out.println("Number of the vowels in a given word is : " + vowel_count);
        System.out.println("Number is the consonants in a given word is  : " + consonant_count);
    }
}
