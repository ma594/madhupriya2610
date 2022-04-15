    //Write a JAVAprogram to count total number of vowels and consonants in a string.
    import java.util.*;
    public class StringB
    {
        public static void main(String[] args)
        {
            int vowel_count=0,conso_count=0;
        String str=new String();
        str="VkrVnbandAgkcollege";
        System.out.println("The vowel in string");
        for(int i=0;i<str.length();i++)
        {
           if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
           {
               System.out.println(" "+str.charAt(i));
               vowel_count++;
           }
        }
        System.out.println("The Consonants in string");
         for(int i=0;i<str.length();i++) 
        {
            if(str.charAt(i)!='a'&& str.charAt(i)!='e'&& str.charAt(i)!='i'&& str.charAt(i)!='o'&& str.charAt(i)!='u') 
            {
                System.out.println(""+str.charAt(i));
                conso_count++;
            }
        }
        System.out.println("The No of Consonants in a String:"+conso_count);
        System.out.println("The No of vowels in a String:"+vowel_count);
    }
}