import java.util.*;

public class prac_20{

    public static void lowercasevowel(String q1){
        int count =0;
        for(int i=0; i<q1.length(); i++){
            char ch=q1.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u'){
                count ++;
            }
        }
        System.out.println("Number of Vowls is "+ count);
    }

    public static void main(String args[]){
        // Answer1: Count how many times lower case vowels occurred in a String entered by the user.
        Scanner sc = new Scanner(System.in);
        String q1;
        q1 = sc.nextLine();
        lowercasevowel(q1);
        
        // Answer4: Determine if 2 Strings areanagramsof each other.
        String str1 = "earth";
        String str2 = "heart";

        // Convert Strings to lowercase. Why? so that we don't have to check separately for lower & uppercase.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // First check - if the lengths are the same
        if (str1.length() == str2.length()) {
            // convert strings into char array
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();

            // sort the char array
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            // if the sorted char arrays are same or identical then the strings are anagram
            boolean result = Arrays.equals(str1CharArray, str2CharArray);
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        } else {
            // case when lengths are not equal
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }
    }
}

